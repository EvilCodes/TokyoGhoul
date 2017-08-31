package com.hyt.services;

import java.util.ArrayList;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.hyt.beans.Users;
import com.hyt.dao.UsersMapper;
import com.hyt.util.mybatis.MyBatisUtil;

public class LoginServices {
	int timeGap=2;
	public Users Login(Users record) throws Exception{
		Users result=null;
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession(false);
		UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
		ArrayList<Users> users = usersMapper.selectByUsernameAndPassword(record);
		if (users==null||users.size()==0) {
			
		} else {
			int state=users.get(0).getState();
			if (state==0) {
				Long st=Long.parseLong(users.get(0).getSt());
				Long currentTime=new Date().getTime();
				if (currentTime-st>(1000*60*60*timeGap)) {
					usersMapper.deleteByPrimaryKey(users.get(0).getId());
				}
			} else {
				result=users.get(0);

			}

		}
		sqlSession.commit();
		return result;
		
		
	}
	

}
