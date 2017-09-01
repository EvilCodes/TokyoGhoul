package com.hyt.dao;



import java.util.List;

import com.hyt.beans.News;
import com.hyt.beans.NewsType;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(News record);
    
    List<News> selectByExample();
    
    List<News> selectByType(NewsType newsType);
    
    int selectByTypeCount(NewsType newsType);


    News selectByPrimaryKey(NewsType newsType);

    int updateByPrimaryKeySelective(News record);

}