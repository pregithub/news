package by.action.impl;

import java.io.IOException;

import org.apache.struts2.ServletActionContext;

import by.action.BaseActionI;

import com.alibaba.fastjson.JSON;

public class BaseAction implements BaseActionI{
	public void writeJson(Object object) {
		try {
			String json = JSON.toJSONStringWithDateFormat(object,
					"yyyy-MM-dd HH:mm:ss");
			ServletActionContext.getResponse().setContentType(
					"text/html;charset=utf-8");
			ServletActionContext.getResponse().getWriter().write(json);
			ServletActionContext.getResponse().getWriter().flush();
			ServletActionContext.getResponse().getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
