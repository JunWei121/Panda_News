package com.demo.controller;

import com.demo.common.utils.DateTimeUtils;
import com.demo.common.utils.MD5Tools;
import com.demo.common.utils.NameUtils;
import com.demo.entity.User;
import com.demo.pojo.UserResult;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userservice;

    /**
     * 上传头像
     */
    @RequestMapping("/upload.action")
    public String uploadPhoto(List<MultipartFile> userphoto, HttpServletRequest request, HttpSession session) {
        User user = (User) session.getAttribute("USER_SESSION");
        Integer uid = user.getUid();
        String newName = null;
        //判断文件不为空
        if (!userphoto.isEmpty() && userphoto.size() > 0) {
            for (MultipartFile uploadFile : userphoto) {
                //获取项目路径
                String dirPath = request.getSession().getServletContext().getRealPath("/images/head/upload/");
                File dir = new File(dirPath);
                //如果不存在则创建
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                //获取原始名
                String originalFilename = uploadFile.getOriginalFilename();
                // 获取后缀名
                String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
                //重命名文件  xxxxx id+ 日期+  文件后缀
                NameUtils nameUtils = new NameUtils();
                newName = nameUtils.NewPhotoName(uid) + suffix;
                // 使用MultiPartFile接口方法上传文件
                try {
                    uploadFile.transferTo(new File(dir + File.separator + newName));
                    System.out.println(dir + File.separator + newName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String hPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() +
                "/images/head/upload/" + newName;
        user.sethPath(hPath);
        userservice.modPhoto(user);
        return "redirect:pages/userCenter/user-Center.html";
    }

    @RequestMapping(value = "/sys/user/listUsers.action", method = RequestMethod.GET)
    @ResponseBody
    public UserResult ListUsers(User user) {
        if (user != null) {
            user.setPageIndex((user.getPageNumber() - 1) * user.getPageSize());
        }
        //当前页的数据
        List<User> listUser = userservice.findListUser(user);
        //所有数据数据量
        user.setPageIndex(null);
        user.setPageSize(null);
        List<User> listUserNoLimit = userservice.findListUser(user);
        int total = listUserNoLimit.size();
        UserResult userResult = new UserResult();
        userResult.setTotal(total);
        userResult.setRows(listUser);
        return userResult;
    }

    /**
     * 禁用用户
     */
    @RequestMapping("/sys/user/disable.action")
    @ResponseBody
    public String disable(Integer uid) {
        Integer integer = userservice.modVerifyDisable(uid);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 启用用户
     */
    @RequestMapping("/sys/user/enable.action")
    @ResponseBody
    public String enable(Integer uid) {
        Integer integer = userservice.modVerifyEnable(uid);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 下载csv文件
     *
     * @param response
     * @throws IOException
     */
    @RequestMapping("/sys/user/download.action")
    @ResponseBody
    public void download(User user, HttpServletResponse response) throws IOException {
        List<User> listUser = userservice.findListUser(user);
        response.setHeader("Content-Type", "application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=user.csv");
        PrintWriter out = response.getWriter();
        StringBuffer table = new StringBuffer("");
        table.append("编号,账号,注册日期时间,是否认证\r\n");
        for (User u : listUser) {
            table.append(u.getUid() + "," + u.getUname() + "," + u.getuCreatetime() + "," +
                    (u.getIsVerify() == 0 ? "未认证✘" : "已认证✔") + "\r\n");
        }
        out.write(table.toString());
    }


    /**
     * 用户页面方法
     */
    /**
     * 用户注册
     */
    @RequestMapping("/user/register.action")
    @ResponseBody
    public String register(User user) {
        String now = new DateTimeUtils().toDateTimeStr(new Date());
        user.setuCreatetime(now);
        String md5Pwd = new MD5Tools().MD5(user.getUpwd());
        user.setUpwd(md5Pwd);

        Integer integer = userservice.addUser(user);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 用户登录
     */
    @RequestMapping("/user/loginin.action")
    @ResponseBody
    public String loginin(HttpServletResponse response, HttpServletRequest request, User user, HttpSession session, @RequestParam(required = false, defaultValue = "0") int check) throws IOException {
        //预存密码
        String cookiePwd = user.getUpwd();
        user.setUpwd(MD5Tools.MD5(user.getUpwd()));
        User account = userservice.findByAccount(user);
        if (account != null) {
            //如果选择记住密码,则创建cookie,并将账号密码注入cookie
            if (check == 1) {
                //创建cookie对象 要处理编码问题
                Cookie ck = new Cookie(URLEncoder.encode(user.getUname(), "UTF-8"), cookiePwd);
                //设置Cookie有效时间,单位为妙
                ck.setMaxAge(60 * 60 * 24);
                //设置Cookie的有效范围,/为全部路径
                ck.setPath("/");
                response.addCookie(ck);
            } else {
                //如果没有选中记住密码,则将已记住密码的cookie失效.即有效时间设为0
                Cookie[] cookies = request.getCookies();
                for (Cookie cookie : cookies) {
                    String name = URLDecoder.decode(cookie.getName(), "UTF-8");
                    if (name.equals(user.getUname())) {
                        cookie.setMaxAge(0);
                        cookie.setPath("/");
                        response.addCookie(cookie);
                    }
                }
            }
            session.setAttribute("USER_SESSION", account);
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 是否登录
     */
    @RequestMapping("/user/isLogin.action")
    @ResponseBody
    public User isLogin(HttpSession session) {
        User user = (User) session.getAttribute("USER_SESSION");
        if (user != null) {
            user.setUpwd("NM$L");
            return user;
        }
        return null;
    }

    /**
     * 退出登录
     */
    @RequestMapping("/user/exit.action")
    @ResponseBody
    public String exit(HttpSession session) {
        session.invalidate();
        return "OK";
    }

    /**
     * 修改账号信息
     */
    @RequestMapping("/user/modAccount.action")
    @ResponseBody
    public String modAccount(User user, HttpSession session) {
        String Md5Pwd = new MD5Tools().MD5(user.getUpwd());
        user.setUpwd(Md5Pwd);
        User u = (User) session.getAttribute("USER_SESSION");
        user.setUid(u.getUid());
        Integer integer = userservice.modAccount(user);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }
}
