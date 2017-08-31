package com.hyt.util.path;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class PathUtil {
	
	public static String getBasePath(HttpServletRequest req){
		String path = req.getContextPath();
		String basePath=req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+path+"/";
		return basePath;
		
	}
	
	public static String getBasePath(HttpServletRequest req,String url){
		String path = req.getContextPath();
		String basePath=req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+path+"/"+url;
		return basePath;
		
	}

}
