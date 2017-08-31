package com.hyt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hyt.beans.Admin;
import com.hyt.services.AdminServices;
import com.hyt.util.path.PathUtil;

@WebServlet( name ="AdminServlet",urlPatterns={
		"/form/AdminServlet.action"
})
public class AdminServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminServices adminServices=new AdminServices();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		if (username!=null&&password!=null) {
			Admin record=new Admin();
			record.setUsername(username);
			record.setPassword(password);
			try {
				Admin temp = adminServices.login(record);
				if (temp!=null) {
					request.getSession().setAttribute("Admin", temp);
					response.sendRedirect(PathUtil.getBasePath(request,"admin/NewsTypeSelectServlet.action"));
					
					
				}else{
					request.getSession().setAttribute("mess", "用户名或密码错误");
					response.sendRedirect(PathUtil.getBasePath(request,"mess.jsp"));
				}
			} catch (Exception e) {
				e.printStackTrace();
				request.getSession().setAttribute("mess", "mybatis错误");
				response.sendRedirect(PathUtil.getBasePath(request,"mess.jsp"));
			}
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		
	}

}
