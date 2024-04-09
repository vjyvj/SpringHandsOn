package com.springboot.handson.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RequestInterceptor implements HandlerInterceptor {
     @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
         System.out.println("Befor e request reaches controller");
         System.out.println(request.getMethod());
         System.out.println(request.getRequestURI());
         return true;
     }

     @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelView) {
         System.out.println("After response from controller");
         System.out.println(response.getStatus());
     }

     @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
         System.out.println("After response sent to client");
     }
}
