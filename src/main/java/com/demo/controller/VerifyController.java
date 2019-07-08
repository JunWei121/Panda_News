package com.demo.controller;

import com.demo.common.utils.DateTimeUtils;
import com.demo.entity.User;
import com.demo.entity.Verify;
import com.demo.pojo.VerifyResult;
import com.demo.service.UserService;
import com.demo.service.VerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class VerifyController {

    @Autowired
    private VerifyService verifyService;

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/sys/verify/listverify.action", method = RequestMethod.GET)
    @ResponseBody
    public VerifyResult listverify(Verify verify) {
        if (verify != null) {
            verify.setPageIndex((verify.getPageNumber() - 1) * verify.getPageSize());
        }
        //当前页的数据
        List<Verify> listverify = verifyService.findListverify(verify);
        //所有数据数据量
        verify.setPageIndex(null);
        verify.setPageSize(null);
        List<Verify> listverifyNoLimit = verifyService.findListverify(verify);
        int total = listverifyNoLimit.size();
        VerifyResult verifyResult = new VerifyResult();
        verifyResult.setTotal(total);
        verifyResult.setRows(listverify);
        return verifyResult;
    }

    /**
     * 禁用用户
     */
    @RequestMapping("/sys/verify/disable.action")
    @ResponseBody
    public String disable(Integer vid) {
        Integer integer = verifyService.modIsDeal(vid);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 启用用户
     */
    @RequestMapping("/sys/verify/enable.action")
    @ResponseBody
    public String enable(Integer vid) {
        Integer integer = verifyService.modIsDeal(vid);
        Verify verify = verifyService.findUidByVid(vid);
        Integer integer1 = userService.modVerifyEnable(verify.getUid());
        if (integer > 0 && integer1 > 0) {
            return "OK";
        }
        return "FAIL";
    }

    /**
     * 提交申请
     */
    @RequestMapping("/user/startVerify.action")
    @ResponseBody
    public String startVerify(Verify verify, HttpSession session) {
        String now = new DateTimeUtils().toDateTimeStr(new Date());
        verify.setvCreatetime(now);
        User user = (User) session.getAttribute("USER_SESSION");
        verify.setUid(user.getUid());
        Integer integer = verifyService.addVerify(verify);
        if (integer > 0) {
            return "OK";
        }
        return "FAIL";
    }
}
