package com.hyt.services;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.hyt.beans.News;
import com.hyt.beans.NewsType;
import com.hyt.dao.NewsMapper;
import com.hyt.dao.NewsTypeMapper;
import com.hyt.util.mybatis.MyBatisUtil;

public class NewsTypeServices {
	public ArrayList<NewsType> findByAll() throws Exception{
		ArrayList<NewsType> result;
		SqlSession sqlSession=MyBatisUtil.getSqlSessionFactory().openSession();
		NewsTypeMapper newsTypeMapper=sqlSession.getMapper(NewsTypeMapper.class);
		result=(ArrayList<NewsType> )newsTypeMapper.selectByExample(null);
		sqlSession.close();
		return result;
		
	}
	
	public NewsType findById(Integer id) throws Exception{
		NewsType result=null;
		SqlSession sqlSession=MyBatisUtil.getSqlSessionFactory().openSession();
		NewsTypeMapper newsTypeMapper=sqlSession.getMapper(NewsTypeMapper.class);
		result=newsTypeMapper.selectByPrimaryKey(id);
		sqlSession.close();
		return result;
		
	}
	
	public boolean add(NewsType record) throws Exception{
		boolean result=false;
		SqlSession sqlSession=MyBatisUtil.getSqlSessionFactory().openSession(false);
		NewsTypeMapper newsTypeMapper=sqlSession.getMapper(NewsTypeMapper.class);
		int temp=newsTypeMapper.insert(record);
		if (temp>0) {
			result=true;
			
			
		}
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public boolean edit(NewsType record)throws Exception{
		boolean result=false;
		SqlSession sqlSession=MyBatisUtil.getSqlSessionFactory().openSession(false);
		NewsTypeMapper newsTypeMapper = sqlSession.getMapper(NewsTypeMapper.class);
		int resultTemp=newsTypeMapper.updateByPrimaryKey(record);
		if (resultTemp>0) {
			sqlSession.commit();
			result=true;
			
		}else {
			throw new Exception(){
				@Override
				public String getMessage(){
					return "编辑错误，数据库没有影响";
				}
			};
		}
		sqlSession.close();
		return result;
	}
	
	public boolean del(int record) throws Exception{
		boolean result=false;
		SqlSession sqlSession=MyBatisUtil.getSqlSessionFactory().openSession(false);
		NewsTypeMapper newsTypeMapper = sqlSession.getMapper(NewsTypeMapper.class);
		NewsMapper newsMapper = sqlSession.getMapper(NewsMapper.class);
		
		NewsType newsType=new NewsType();
		newsType.setId(record);
		int resultTemp= newsMapper.selectByTypeCount(newsType);
		if (resultTemp==0) {
			int temp = newsTypeMapper.deleteByPrimaryKey(record);
			if (temp>0) {
				result=true;
				sqlSession.commit();
			}else {
				throw new Exception(){
					@Override
					public String getMessage(){
						return "数据库没有影响";
					}
					
				};
			}
			
		}else {
			throw new Exception(){
				@Override
				public String getMessage(){
					return "新闻类型有新闻，不可以删除";
				}
			};
		}
		sqlSession.close();
		return result;
	}
}
