package by.dao.impl;

import org.apache.log4j.Logger;
import org.junit.Test;

import by.dao.BaseDaoI;
import by.model.database.Tnewsurl;
import by.model.source.impl.TencentSourceModel;

public class TencentDaoTest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TencentDaoTest.class);

	TencentDao tencentDao = new TencentDao();

	String url = "http://r.inews.qq.com/getQQNewsIndexAndItems?qqnetwork=wifi&hw=ibm_thinkpad&mac=mac%2Bunknown&apptype=android&chlid=news_news_finance";
	TencentSourceModel tsm = new TencentSourceModel();

	public void testJSONStringToJAVAObject() throws Exception {

		tsm = tencentDao.getSourceModel(url);
		logger.info(tsm);
	}

}
