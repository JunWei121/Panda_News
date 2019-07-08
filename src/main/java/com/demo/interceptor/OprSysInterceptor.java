package com.demo.interceptor;

import com.demo.entity.Role;
import com.demo.entity.SysUser;
import com.demo.service.RoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * 操作管理员拦截器
 */
public class OprSysInterceptor implements HandlerInterceptor {
    @Autowired
    private RoleService roleService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String url = httpServletRequest.getRequestURI();
        Logger logger = Logger.getLogger("myLog");
        logger.warn("系统操作拦截器：" + url);
        HttpSession session = httpServletRequest.getSession();
        SysUser sysUser = (SysUser) session.getAttribute("SYS_USER_SESSION");
        //如果已经登录
        if (sysUser != null) {
            Role role = roleService.findAllRoleById(sysUser.getRid());
            if (role != null && role.getOprSys() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
