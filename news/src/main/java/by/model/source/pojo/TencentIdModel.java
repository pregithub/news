package by.model.source.pojo;

import by.model.source.BaseSourceModelI;
import by.model.source.impl.BaseSourceModel;

public class TencentIdModel extends BaseSourceModel implements BaseSourceModelI {

	// 是否存在，0表示不存在，1表示存在
	private String exist;
	// 表示是否隐藏图片，0表示不隐藏，1表示隐藏
	private String hidepic;

	public String getExist() {
		return exist;
	}

	public void setExist(String exist) {
		this.exist = exist;
	}

	public String getHidepic() {
		return hidepic;
	}

	public void setHidepic(String hidepic) {
		this.hidepic = hidepic;
	}

	@Override
	public String toString() {
		return "TencentId [id=" + super.getId() + ",comments=" + super.getComments()
				+ ",exist=" + exist + ", hidepic=" + hidepic + "]";
	}

}
