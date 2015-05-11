package by.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import by.dao.BaseDaoI;
import by.model.source.impl.TencentSourceModel;
import by.model.source.pojo.TencentIdModel;
import by.model.source.pojo.TencentNewsModel;
import by.util.JsonHelper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class TencentDao {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TencentDao.class);

	TencentSourceModel tsm = new TencentSourceModel();

	// 通过数据库的新闻示例模型，来获得腾讯新闻的来源模型实例
	public TencentSourceModel getSourceModel(String url) throws Exception {
		String jsonStr = JsonHelper.getJsonStringByUrl(url);
		JSONArray idlist = JSON.parseObject(jsonStr).getJSONArray("idlist");
		tsm.setIds(getIds(idlist));
		tsm.setNewslist(getNewslist(idlist));
		tsm.setRet(JSON.toJSONString("ret"));
		tsm.setTimestamp(JSON.toJSONString("timestamp"));
		tsm.setVersion(JSON.toJSONString("version"));
		// logger.info(tsm);
		return tsm;
	}

	private List<TencentNewsModel> getNewslist(JSONArray idlist) {
		JSONArray newslistArray = idlist.getJSONObject(0).getJSONArray(
				"newslist");
		List<TencentNewsModel> newslist = new ArrayList<TencentNewsModel>();
		for (int i = 0; i < newslistArray.size(); i++) {
			JSONObject o = newslistArray.getJSONObject(i);
			TencentNewsModel news = new TencentNewsModel();
			news.setId(o.getString("id"));
			news.setTitle(o.getString("title"));
			news.setUinnick(o.getString("uinnick"));
			news.setUinname(o.getString("uinname"));
			news.setAbstractStr(o.getString("abstract"));
			// logger.info(news);
			newslist.add(news);
		}
		// logger.info(newslist);
		return newslist;
	}

	// 获得腾讯新闻的唯一标识列表，唯一标识列表是用来索引上一页下一页，或者展示在概览页里
	private List<TencentIdModel> getIds(JSONArray idlist) {
		JSONArray idsArray = idlist.getJSONObject(0).getJSONArray("ids");

		List<TencentIdModel> ids = new ArrayList<TencentIdModel>();
		for (int i = 0; i < idsArray.size(); i++) {
			JSONObject idObject = idsArray.getJSONObject(i);
			TencentIdModel id = new TencentIdModel();
			id.setId(idObject.getString("id"));
			id.setExist(idObject.getString("exist"));
			id.setComments(idObject.getString("comments"));
			id.setHidepic(idObject.getString("hidepic"));
			// logger.info(id);
			ids.add(id);
		}
		// logger.info(ids);
		return ids;
	}
}
