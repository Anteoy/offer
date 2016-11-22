package com.dazhuangzhou.service;

import java.util.List;

import com.dazhuangzhou.vo.model.NewsVO;
import com.dazhuangzhou.vo.model.NewsVOExample;

/**
 * @author lisanlai
 *
 */
public interface NewsService {

	int countByExample(NewsVOExample example);

    int deleteByExample(NewsVOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsVO record);

    int insertSelective(NewsVO record);

    List<NewsVO> selectByExample(NewsVOExample example);

    NewsVO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(NewsVO record, NewsVOExample example);

    int updateByExample(NewsVO record, NewsVOExample example);

    int updateByPrimaryKeySelective(NewsVO record);

    int updateByPrimaryKey(NewsVO record);
}
