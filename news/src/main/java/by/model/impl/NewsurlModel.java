package by.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Newsurl 页面的模型，应该加上页面的参数
 */

public class NewsurlModel implements java.io.Serializable {

	// Fields

	private Integer urlid;
	private String usite;
	private String uchannel;
	private String url;
	private String upage;

	public Integer getUrlid() {
		return urlid;
	}

	public void setUrlid(Integer urlid) {
		this.urlid = urlid;
	}

	public String getUsite() {
		return usite;
	}

	public void setUsite(String usite) {
		this.usite = usite;
	}

	public String getUchannel() {
		return uchannel;
	}

	public void setUchannel(String uchannel) {
		this.uchannel = uchannel;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUpage() {
		return upage;
	}

	public void setUpage(String upage) {
		this.upage = upage;
	}

}