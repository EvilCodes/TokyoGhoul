package com.hyt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.hyt.util.log.LogUtil;

public class AdminFilter implements Filter{

	@Override
	public void destroy() {
		LogUtil.log("desAdminFilter");
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		LogUtil.log("AdminFilter");
	}

}
