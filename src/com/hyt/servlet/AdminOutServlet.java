package com.hyt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLPermission;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hyt.util.path.PathUtil;
@WebServlet(
		name="AdminOutServlet",
		urlPatterns={"/admin/AdminOutServlet.action"}

		)
public class AdminOutServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("Admin");
		response.sendRedirect(PathUtil.getBasePath(request,"adminLogin.jsp"));
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
