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
import com.hyt.util.path.PathUtil;
@WebFilter(
			filterName="F002",
			urlPatterns={"/admin/*"}
		
		)
public class AdminFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest=(HttpServletRequest) request;
		HttpServletResponse httpServletResponse=(HttpServletResponse) response;
		Object obj = httpServletRequest.getSession().getAttribute("Admin");
		
		if (obj!=null) {
			chain.doFilter(request, response);
			
			
		}else {
			httpServletResponse.sendRedirect(PathUtil.getBasePath(httpServletRequest,"index.jsp"));
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		LogUtil.log("AdminFilter");
	}

}
