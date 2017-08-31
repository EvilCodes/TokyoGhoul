package com.hyt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hyt.util.log.LogUtil;


@WebServlet(
		
			name="s2",
			urlPatterns={"/servlet/s2"}
		
		)
public class S2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LogUtil.log("S2S2S2S2S2S2S2S2S2S2S2S2S2S2S2S2S2S2S2");
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
	