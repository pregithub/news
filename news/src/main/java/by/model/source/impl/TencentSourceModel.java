package by.model.source.impl;

import java.util.List;

import by.model.source.BaseSourceModelI;
import by.model.source.pojo.TencentIdModel;
import by.model.source.pojo.TencentNewsModel;

public class TencentSourceModel extends BaseSourceModel implements
		BaseSourceModelI {
	// 新闻的唯一标识符列表，用来索引下一页，或者上一页
	private List<TencentIdModel> ids;
	// 新闻细览的列表，在新闻的概览页进行展示
	private List<TencentNewsModel> newslist;
	//
	private String ret;
	// 时间戳
	private String timestamp;
	// 版本
	private String version;

	public List<TencentIdModel> getIds() {
		return ids;
	}

	public void setIds(List<TencentIdModel> ids) {
		this.ids = ids;
	}

	public List<TencentNewsModel> getNewslist() {
		return newslist;
	}

	public void setNewslist(List<TencentNewsModel> newslist) {
		this.newslist = newslist;
	}

	public String getRet() {
		return ret;
	}

	public void setRet(String ret) {
		this.ret = ret;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "TencentSourceModel [ids=" + ids + ", newslist=" + newslist
				+ ", ret=" + ret + ", timestamp=" + timestamp + ", version="
				+ version + "]";
	}

}
