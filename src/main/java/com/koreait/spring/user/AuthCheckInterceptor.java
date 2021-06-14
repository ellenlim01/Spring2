package com.koreait.spring.user;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthCheckInterceptor implements HandlerInterceptor {

    //controller로 보내기 전에 처리
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    //controller의 handler가 끝나면 처리
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse rsponse, Object o, ModelAndView modelAndView) throws Exception {
        UserEntity loginUser = (UserEntity) request.getSession().getAttribute("loginUser");
        if(loginUser == null) {
            System.out.println("viewName : " + modelAndView.getViewName());
            modelAndView.setViewName("/user/needLogin");
//           임지영 바보
        }
    }

    //view까지 처리가 끝난 후에 처리
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
