package com.dazhuangzhou.service.impl;

import com.dazhuangzhou.dao.NewsVOMapper;
import com.dazhuangzhou.service.NewsService;
import com.dazhuangzhou.vo.model.NewsVO;
import com.dazhuangzhou.vo.model.NewsVOExample;

import java.util.List;

/**
 * @author dazhuang.zhou
 *
 */
public class NewsServiceImpl implements NewsService {
	
	/**
	 * 待注入的Dao Bean，这里只定义的一个接口，代码中我们并没有手工去写Dao层的实现，
	 * 这就是mybatis-spring为我们完成的工作，我们在applicationContextDao.xml中定义
	 * 	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
	 *		<property name="basePackage" value="com.dazhuangzhou.dao" />
	 *	</bean>
	 * 这样mybatis-spring就自动装配了
	 * */
	private NewsVOMapper newsVOMapper;

	public NewsVOMapper getNewsVOMapper() {
		return newsVOMapper;
	}

	public void setNewsVOMapper(NewsVOMapper newsVOMapper) {
		this.newsVOMapper = newsVOMapper;
	}

	@Override
	public int countByExample(NewsVOExample example) {
		return newsVOMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(NewsVOExample example) {
		return newsVOMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return newsVOMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(NewsVO record) {
		return newsVOMapper.insert(record);
	}

	@Override
	public int insertSelective(NewsVO record) {
		return newsVOMapper.insertSelective(record);
	}

	@Override
	public List<NewsVO> selectByExample(NewsVOExample example) {
		return newsVOMapper.selectByExample(example);
	}

	@Override
	public NewsVO selectByPrimaryKey(Integer id) {
		return newsVOMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(NewsVO record, NewsVOExample example) {
		return newsVOMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(NewsVO record, NewsVOExample example) {
		return newsVOMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(NewsVO record) {
		return newsVOMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(NewsVO record) {
		return newsVOMapper.updateByPrimaryKey(record);
	}

}
