package com.hyt.util.log;

import org.apache.logging.log4j.Logger;

public class LogUtil {
	
	//��AppListener�����ʼ��
	
	public static Logger logger=null;
	/**
	 * debug����
	 * @param mess
	 */
	public static void log(String mess){
		logger.debug(mess);
	}

}
