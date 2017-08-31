package com.hyt.dao;

import java.util.ArrayList;

import com.hyt.beans.NewsType;
import com.hyt.beans.NewsTypeExample;

public interface NewsTypeMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(NewsType record);

    int insertSelective(NewsType record);

    NewsType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsType record);
    
    ArrayList<NewsType> selectByExample(NewsTypeExample example);

    int updateByPrimaryKey(NewsType record);
}
