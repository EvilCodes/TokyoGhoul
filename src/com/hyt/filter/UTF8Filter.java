package com.hyt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hyt.util.log.LogUtil;


@WebFilter(
			filterName="F003",
			urlPatterns={"/*"}
		)
public class UTF8Filter implements Filter{

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest=(HttpServletRequest) request;
		HttpServletResponse httpServletResponse=(HttpServletResponse) response;
		
		httpServletRequest.setCharacterEncoding("utf-8");
		httpServletResponse.setContentType("text/html; charset=UTF-8");
		
		System.out.println("ddddddddd");
		chain.doFilter(httpServletRequest, httpServletResponse);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		LogUtil.log("UTF8Filter");
		
		
	}
	

}
