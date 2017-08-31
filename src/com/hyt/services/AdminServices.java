package com.hyt.services;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.hyt.beans.Admin;
import com.hyt.beans.AdminExample;
import com.hyt.beans.AdminExample.Criteria;
import com.hyt.dao.AdminMapper;
import com.hyt.util.mybatis.MyBatisUtil;

public class AdminServices {
	public Admin login(Admin record)throws Exception{
		Admin result=null;
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(false);
		AdminMapper adminMapper = sqlSession.getMapper(AdminMapper.class);
		AdminExample adminExample=new AdminExample();
		Criteria criteria =adminExample.createCriteria();
		criteria.andUsernameEqualTo(record.getUsername()).andPasswordEqualTo(record.getPassword());
		ArrayList<Admin>admins=adminMapper.selectByExample(adminExample);
		if (admins!=null&&admins.size()>0) {
			result=admins.get(0);
			
		}
		sqlSession.close();
		return result;
		
		
		
		
	}

}
