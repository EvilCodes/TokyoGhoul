package com.hyt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.mail.EmailException;
import org.apache.logging.log4j.core.lookup.MainMapLookup;

import com.hyt.util.mail.MailUtil;
import com.hyt.util.mail.SendMailData;
@WebServlet(
		name="s3",
		urlPatterns={"/S3"}
	)
public class S3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SendMailData sendMailData=new SendMailData();
		sendMailData.setTitle("xxxxxxxxxxxxxxxxxxxxxx");
		sendMailData.setAddress("huangy_tao@126.com");
		sendMailData.setInfo("込込込込込込込込込<hr><p>泣似全俊��</p><a href='http://www.baidu.com'>sssss</a>");
		try {
			MailUtil.sendMail(sendMailData);
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
