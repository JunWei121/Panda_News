package com.demo.interceptor;

import com.demo.entity.SysUser;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * 登录拦截器
 */
public class SystemLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String url = httpServletRequest.getRequestURI();
        Logger logger = Logger.getLogger("myLog");
        logger.warn("拦截器：" + url);
        //如果是login.action请求  已在xml文件里配置
/*        if (url.indexOf("sys/login.action") > 1) {
            return true;
        }
        if (url.indexOf("sys/admin.action") > 1) {
            return true;
        }*/
        HttpSession session = httpServletRequest.getSession();
        SysUser sysUser = (SysUser) session.getAttribute("SYS_USER_SESSION");
        //如果已经登录
        if (sysUser != null) {
            //且账号可用
            return true;
        }
        //如果未登录
        httpServletRequest.getSession().setAttribute("msg", "您尚未登陆!");
        httpServletRequest.getRequestDispatcher("/WEB-INF/pages/login.html").forward(httpServletRequest, httpServletResponse);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
