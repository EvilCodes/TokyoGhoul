package com.hyt.util.mybatis;

import java.io.IOException;
import java.io.InputStream;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	public static SqlSessionFactory getSqlSessionFactory() throws IOException{
		String resource="mybatis-config.xml";
		InputStream inputStream;
		SqlSessionFactory sqlSessionFactory=null;
		inputStream=Resources.getResourceAsStream(resource);
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}


}
