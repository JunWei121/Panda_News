package com.demo.controller;

import com.demo.entity.SysUser;
import com.demo.pojo.PageResult;
import com.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * 管理员控制层
 */
@Controller
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 后台地址
     */
    @RequestMapping("/sys/admin.action")
    public String toAdmin() {
        return "login";
    }


    /**
     * 判断登录状态 提示非法访问
     */
    @RequestMapping("/sys/loginState.action")
    @ResponseBody
    public String loginState(HttpSession session) {
        String msg = (String) session.getAttribute("msg");
        if (msg != null) {
            //只用一次
            session.removeAttribute("msg");
            return "NOLOGIN";
        }
        return "xx";
    }

    /**
     * 返回当前登陆用户信息
     */
    @RequestMapping(value = "/sys/userInfo.action", method = RequestMethod.POST)
    @ResponseBody
    public SysUser userInfo(HttpSession session) {
        SysUser sysUser = (SysUser) session.getAttribute("SYS_USER_SESSION");
        if (sysUser != null) {
            List<SysUser> sysUserList = sysUserService.findSysUserList(sysUser);
            for (SysUser u : sysUserList) {
                u.setSpwd("想看密码，你在想屁吃?");
                return u;
            }
        }
        return null;
    }

    /**
     * 跳转到admin
     */
    @RequestMapping(value = "/sys/toadmin.action", method = RequestMethod.GET)
    public String toadmin(HttpSession session) {
        //使用拦截器实现
        SysUser sysUser = (SysUser) session.getAttribute("SYS_USER_SESSION");
        if (sysUser == null) {
            session.setAttribute("msg", "您尚未登陆!");
            return "redirect:login.action";
        }
        return "admin";
    }


    /**
     * 跳转到后台
     */
    @RequestMapping(value = "/sys/tohoutai.action", method = RequestMethod.GET)
    public String toHoutai(HttpSession session) {
        //使用拦截器实现
        SysUser sysUser = (SysUser) session.getAttribute("SYS_USER_SESSION");
        if (sysUser == null) {
            session.setAttribute("msg", "您尚未登陆!");
            return "redirect:login.action";
        }
        return "houtai";
    }

    /**
     * 根据账号和密码控制登录
     */
    @RequestMapping(value = "/sys/login.action", method = RequestMethod.POST)
    @ResponseBody
    public String loginByAccount(String sname, String spwd, HttpSession session) {
        SysUser sysUser = sysUserService.fingByAccount(sname, spwd);
        //用户存在
        if (sysUser != null) {
            //用户被冻结
            if (sysUser.getState() == 0) {
                return "DISABLED";
            } else { //未冻结
                //存入用户信息
                session.setAttribute("SYS_USER_SESSION", sysUser);
                return "OK";
            }
        }
        return "FAIL";
    }

    /**
     * 退出登录
     */
    @RequestMapping("/sys/logout.action")
    public String logout(HttpSession session) {
        session.removeAttribute("SYS_USER_SESSION");
        session.invalidate();
//        return "forward:/WEB-INF/pages/login.html";
        return "redirect:login.action";
    }

    /**
     * 跳转到登陆页面
     */
    @RequestMapping(value = "/sys/login.action", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    /**
     * 角色管理框架页面
     */
    @RequestMapping(value = "/sys/rolePage.action", method = RequestMethod.GET)
    public String rolePage() {
        return "/sys/roleManger";
    }

    /**
     * 管理员管理框架页面
     */
    @RequestMapping(value = "/sys/adminPage.action", method = RequestMethod.GET)
    public String adminPage() {
        return "sys/sysUserManger";
    }

    /**
     * 用户管理框架页面
     */
    @RequestMapping(value = "/sys/userPage.action", method = RequestMethod.GET)
    public String userPage() {
        return "user/userManger";
    }

    /**
     * 认证管理框架页面
     */
    @RequestMapping(value = "/sys/verifyPage.action", method = RequestMethod.GET)
    public String verifyPage() {
        return "user/verifyManger";
    }

    /**
     * 新闻类别管理框架页面
     */
    @RequestMapping(value = "/sys/sortPage.action", method = RequestMethod.GET)
    public String sortPage() {
        return "info/sortManger";
    }

    /**
     * 新闻管理框架页面
     */
    @RequestMapping(value = "/sys/newsPage.action", method = RequestMethod.GET)
    public String newsPage() {
        return "info/newsManger";
    }

    /**
     * 评论管理框架页面
     */
    @RequestMapping(value = "/sys/commentPage.action", method = RequestMethod.GET)
    public String commentPage() {
        return "info/commentManger";
    }


    /**
     * 实现分页
     */
    @RequestMapping(value = "/sys/listByPage.action", method = RequestMethod.GET)
    @ResponseBody
    public PageResult listByPage(SysUser sysUser) {
        if (sysUser != null) {
            sysUser.setPageIndex((sysUser.getPageNumber() - 1) * sysUser.getPageSize());
        }
        List<SysUser> userList = sysUserService.findSysUserList(sysUser);
        //不需要看到密码
        for (SysUser s : userList) {
            s.setSpwd("想看密码，没门!");
        }
        //查找数据数
        sysUser.setPageIndex(null);
        sysUser.setPageSize(null);
        List<SysUser> userListNoLimit = sysUserService.findSysUserList(sysUser);
        int total = userListNoLimit.size();
        //返回数据
        PageResult pageResult = new PageResult();
        pageResult.setRows(userList);
        pageResult.setTotal(total);
        return pageResult;
    }

    /**
     * 创建管理员
     */
    @RequestMapping("/sys/admin/create.action")
    @ResponseBody
    public String createSysUser(SysUser sysUser) {
        Date date = new Date();
        Timestamp timeStamp = new Timestamp(date.getTime());
        System.out.println(timeStamp);
        sysUser.setCreatetime(timeStamp.toString());
        sysUser.setState(1);
        Integer integer = sysUserService.addSysUser(sysUser);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 禁用管理员
     */
    @RequestMapping("/sys/admin/disable.action")
    @ResponseBody
    public String disable(Integer sid) {
        Integer integer = sysUserService.modStateDisable(sid);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 禁用管理员
     */
    @RequestMapping("/sys/admin/enable.action")
    @ResponseBody
    public String enable(Integer sid) {
        Integer integer = sysUserService.modStateEnable(sid);
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
    @RequestMapping("/sys/admin/download.action")
    @ResponseBody
    public void download(SysUser sysUser, HttpServletResponse response) throws IOException {

        List<SysUser> userList = sysUserService.findSysUserList(sysUser);
        //response.setContentType("text/html;charset=utf-8");
        //response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=admin.csv");
        PrintWriter out = response.getWriter();
        //加上bom头,解决excel打开乱码问题
//        byte[] bomStrByteArr = new byte[]{(byte) 0xef, (byte) 0xbb, (byte) 0xbf};
//        String bomStr = new String(bomStrByteArr, "UTF-8");
//        out.write(bomStr);

        StringBuffer str = new StringBuffer("");
        str.append("编号,账号,角色,创建日期时间,状态\r\n");
        for (SysUser user : userList) {
            str.append(user.getSid() + "," + user.getSname() + "," + user.getRname() + "," + user.getCreatetime() + "," +
                    (user.getState() == 0 ? "禁用" : "可用") + "\r\n");
        }
        response.getWriter().write(str.toString());
    }
}
