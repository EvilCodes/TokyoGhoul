package com.hyt.util.kaptcha;

import javax.servlet.http.HttpServletRequest;

public class KaptchaUtil {
	public static String getKaptcha(HttpServletRequest request){
		Object object = request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		if (object==null) {
			return null;
			
		}else {
			return (String )object;
		}
		
	}

}
