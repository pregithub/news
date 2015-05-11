package by.model.impl;

import by.model.BaseModelI;

public abstract class BaseModel implements BaseModelI {

	// 唯一标识符，如：FIN201505080615360I
	private String id;
	// 新闻标题，如 title: "新股轮番轰炸 20家IPO获批文"
	private String title;
	// 新闻摘要
	private String abstractStr;
	// 表示评论条数
	private String comments;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstractStr() {
		return abstractStr;
	}

	public void setAbstractStr(String abstractStr) {
		this.abstractStr = abstractStr;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "BaseModel [id=" + id + ", abstractStr=" + abstractStr
				+ ", comments=" + comments + "]";
	}

}
