package com.dazhuangzhou.actions;

import com.dazhuangzhou.actions.base.BaseAction;
import com.dazhuangzhou.service.NewsService;
import com.dazhuangzhou.vo.model.NewsVO;
import com.dazhuangzhou.vo.model.NewsVOExample;
import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import java.util.Date;
import java.util.List;

public class AdminAction extends BaseAction {

	private static final long serialVersionUID = -9109111310453150580L;

	/** 待注入的Service Bean*/
	private NewsService newsService;

	public NewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	/**
	 * 测试自定义拦截器
	 * @return
	 */
	public String testInterceptor(){
		//logic code here
		return SUCCESS;
	}
	
	/**
	 * 测试数据的增删改查
	 * @return
	 * @throws JSONException
	 */
	public String testCrud() throws JSONException{
		String b = "<br />";
		String response = "测试数据的增删改查:<br />";
		
		//查
		NewsVOExample example = new NewsVOExample();
		example.or().andIdIsNotNull();
		List<NewsVO> list = newsService.selectByExample(example);
		response += "原始数据：<br />";
		for (NewsVO newsVO : list) {
			response += JSONUtil.serialize(newsVO)+b;
		}
		//增
		NewsVO record = new NewsVO();
		record.setTitle("这是我新增的一个新闻");
		record.setContent("2012其实真的快到了");
		record.setSource("火星资讯");
		record.setDate(new Date());
		int result = newsService.insert(record);
		response += result==1?"插入新数据成功":"插入数据失败"+b;
		list = newsService.selectByExample(example);
		response += "插入数据后："+b;
		for (NewsVO newsVO : list) {
			response += JSONUtil.serialize(newsVO)+b;
		}
		//改
		record = newsService.selectByExample(example).get(0);
		response += "修改前的数据:"+b+JSONUtil.serialize(record);
		example = new NewsVOExample();
		example.or().andTitleEqualTo(record.getTitle());
		int originId = record.getId();
		record.setTitle("这是我修改后的标题");
		result = newsService.updateByExample(record, example);
		response += result==1?"修改成功":"修改失败"+b;
		example.or().andTitleEqualTo(record.getTitle());
		record = newsService.selectByPrimaryKey(originId);
		response +="修改后的数据:"+b+JSONUtil.serialize(record)+b;
		
		//删
		example.or().andTitleEqualTo("这是我新增的一个新闻");
		newsService.deleteByExample(example);
		example.or().andIdIsNotNull();
		list = newsService.selectByExample(example);
		response += "删除数据后："+b;
		for (NewsVO newsVO : list) {
			response += JSONUtil.serialize(newsVO)+b;
		}
		write(response);
		return SUCCESS;
	}

}
