package com.hyt.util.log;

import org.apache.logging.log4j.Logger;

public class LogUtil {
	
	//在AppListener里面初始化
	
	public static Logger logger=null;
	/**
	 * debug级别
	 * @param mess
	 */
	public static void log(String mess){
		logger.debug(mess);
	}

}
