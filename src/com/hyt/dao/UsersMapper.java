package com.hyt.dao;

import java.util.ArrayList;

import com.hyt.beans.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);
    
    ArrayList<Users> selectByUsernameAndPassword(Users record);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}