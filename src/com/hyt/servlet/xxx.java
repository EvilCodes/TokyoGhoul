package com.hyt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hyt.services.NewsTypeServices;
import com.hyt.util.log.LogUtil;

public class xxx extends HttpServlet {
	private void destry() {
		super.destroy();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NewsTypeServices newsTypeServices=new NewsTypeServices();
		try {
			LogUtil.log(String.valueOf(newsTypeServices.del(2)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LogUtil.log("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"+e.getMessage());
			
		}
		
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	
	}
	
	@Override
	public void init() throws ServletException {
		
	}
}
