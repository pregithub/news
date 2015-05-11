package by.model.source.pojo;

import by.model.source.BaseSourceModelI;
import by.model.source.impl.BaseSourceModel;

public class TencentNewsModel extends BaseSourceModel implements BaseSourceModelI {
	// 唯一昵称，比如腾讯新闻
	private String uinnick;
	// 唯一字符串名称，比如news_news_finance_yaowen
	private String uinname;
	
	
	// adTitle: ""
	// articletype: "0"
	// bigPicStyleImg: ""
	// comment: ""
	// commentPlacementId: ""
	// commentid: "1157078682"
	// flag: "0"
	// gesture: 1
	// id: "FIN201505080615360I"
	// imagecount: 2
	// keywords: [{tagid: "582", tagname: "IPO", site: "finance"}, {tagid: "578", tagname: "创业板", site: "finance"}]
	// openAds: 1
	// openAdsComment: 1
	// openAdsPhotos: 0
	// openAdsText: 1
	// openBigImage: 0
	// pushCommentCount: 0
	// qishu: ""
	// short_url: "http://url.cn/fx3o3l"
	// showBigPicStyle: "0"
	// showType: "three"
	// showType_video: "normal"
	// show_expr: 1
	// smallWindow: 1
	// source: "腾讯证券"
	// surl: "http://view.inews.qq.com/a/FIN201505080615360I"
	// tag: ["ipo", "创业板", "证监会", "国内资本市场"]
	// thumbnails: ["http://inews.gtimg.com/newsapp_ls/0/45186479_640330/0"]
	// thumbnails_big: []
	// thumbnails_qqnews: ["http://inews.gtimg.com/newsapp_ls/0/45186479_640330/0"]
	// thumbnails_qqnews_photo: ["http://inews.gtimg.com/newsapp_ls/0/45186479_640330/0"]
	// time: "2015-05-08 19:01:15"
	// timestamp: 1431095254
	// uinname: "news_news_finance_yaowen"
	// uinnick: "腾讯新闻"
	// url: "http://view.inews.qq.com/a/FIN201505080615360I"
	// voteId: ""
	// voteNum: ""
	// weiboid: ""

	public String getUinnick() {
		return uinnick;
	}

	public void setUinnick(String uinnick) {
		this.uinnick = uinnick;
	}

	public String getUinname() {
		return uinname;
	}

	public void setUinname(String uinname) {
		this.uinname = uinname;
	}

	@Override
	public String toString() {
		return "TencentNews [id=" + super.getId() + ",abstractStr="
				+ super.getAbstractStr() + ",uinnick=" + uinnick + ", uinname="
				+ uinname + "]";
	}

}
