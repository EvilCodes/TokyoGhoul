package com.hyt.listener;



import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.logging.log4j.LogManager;

import com.hyt.util.app.AppUtil;
import com.hyt.util.log.LogUtil;
import com.sun.mail.imap.AppendUID;

public class AppListener implements ServletContextListener,ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		String logTarget = sce.getServletContext().getInitParameter("logTarget");
		LogManager.getLogger(logTarget);
		LogUtil.log("***************应用启动**************");
		//获取上下文
		AppUtil.SC=sce.getServletContext();
		LogUtil.log("**************AppUtil.SC_OK******************");
		
		
		
		
		
	}

}
