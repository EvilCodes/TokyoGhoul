package com.hyt.util.encode;

import org.apache.commons.codec.digest.DigestUtils;

public class EncodeUtil {
	public static String MD5(String src){
		return DigestUtils.md2Hex(src);
		
	}
}
