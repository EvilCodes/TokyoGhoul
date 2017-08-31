package com.hyt.dao;

import java.util.ArrayList;

import com.hyt.beans.Admin;
import com.hyt.beans.AdminExample;

public interface AdminMapper {

    int deleteByPrimaryKey(Integer id);

   
    int insert(Admin record);

    int insertSelective(Admin record);


    Admin selectByPrimaryKey(Integer id);
    
    ArrayList<Admin> selectByExample(AdminExample adminExample);

  
    int updateByPrimaryKeySelective(Admin record);

   
    int updateByPrimaryKey(Admin record);
}