package com.hyt.services;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.hyt.beans.News;
import com.hyt.dao.NewsMapper;
import com.hyt.util.mybatis.MyBatisUtil;

public class NewsServices {
	
	public ArrayList<News> findByAll() throws Exception{
		ArrayList<News> result=null;
		 SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		 NewsMapper newsMapper = sqlSession.getMapper(NewsMapper.class);
		 result=(ArrayList<News>) newsMapper.selectByExample();
		 sqlSession.close();
		 
		 return result;
		 
	}

}
