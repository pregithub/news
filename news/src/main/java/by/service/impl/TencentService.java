package by.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.dao.impl.TencentDao;
import by.service.BaseNewsServiceI;

//@Service("tencentService")
public class TencentService extends BaseNewsService implements BaseNewsServiceI {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TencentService.class);

	private TencentDao tencentDao;

	public TencentDao getTencentDao() {
		return tencentDao;
	}

	@Autowired
	public void setTencentDao(TencentDao tencentDao) {
		this.tencentDao = tencentDao;
	}
	
}
