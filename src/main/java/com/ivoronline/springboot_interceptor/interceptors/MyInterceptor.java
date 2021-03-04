package com.ivoronline.springboot_interceptor.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {

  //====================================================================
  // PRE HANDLE
  //====================================================================
  @Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		System.out.print("MyInterceptor: preHandle()       ");
		System.out.println(request.getMethod());
		return true;
	}

  //====================================================================
  // POST HANDLE
  //====================================================================
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
	  System.out.print("MyInterceptor: postHandle()      ");
	  System.out.println(response.getStatus());
	}

  //====================================================================
  // AFTER COMPLETION
  //====================================================================
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) {
	  System.out.print("MyInterceptor: afterCompletion() ");
	  System.out.println(response.getStatus());
	}

}
