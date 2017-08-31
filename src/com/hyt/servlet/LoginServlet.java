package com.hyt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hyt.beans.Users;
import com.hyt.services.LoginServices;
import com.hyt.util.log.LogUtil;
import com.hyt.util.path.PathUtil;

public class LoginServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Users record=new Users();
			record.setUsername(username);
			record.setPassword(password);
			LoginServices loginServices=new LoginServices();
			Users result;
			try {
				result=loginServices.Login(record);
				if (result!=null) {
					LogUtil.log("登录成功");
					request.getSession().setAttribute("Users", record);
					response.sendRedirect(PathUtil.getBasePath(request,"index.jsp"));
					
					
				}else {
					LogUtil.log("用户名和密码错误");
					request.getSession().setAttribute("mess", "用户名和密码错误");
					response.sendRedirect(PathUtil.getBasePath(request,"mess.jsp"));
					
				}
			} catch (Exception e) {
				e.printStackTrace();
				LogUtil.log("用户名和密码错误");
				request.getSession().setAttribute("mess", "用户名和密码错误");
				response.sendRedirect(PathUtil.getBasePath(request, "mess.jsp"));
			}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);	
		
	}

}
