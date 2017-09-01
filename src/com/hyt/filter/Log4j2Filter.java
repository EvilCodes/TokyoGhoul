package com.hyt.filter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;

import org.apache.logging.log4j.web.Log4jServletFilter;

import com.hyt.util.log.LogUtil;

@WebFilter(
			filterName="F001",
			urlPatterns={"/*"},
			dispatcherTypes={
					DispatcherType.INCLUDE,
					DispatcherType.ASYNC,
					DispatcherType.ERROR,
					DispatcherType.FORWARD,
					DispatcherType.REQUEST,
			}
		
		)
public class Log4j2Filter extends Log4jServletFilter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		super.init(filterConfig);
		LogUtil.log("Log4j2Filter");
	}
}
