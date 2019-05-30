package hsx.com.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import hsx.com.dao.PageClickDao;
import hsx.com.service.PageClickService;

@Service("pageClickService")
public class PageClickServiceImpl implements PageClickService{

	@Resource
	private PageClickDao pageClickDao;

	@Override
	public int indexcountset() {
		return pageClickDao.indexcountsetup();
	}

	@Override
	public Integer readindexcountset() {		
		return pageClickDao.readindexcountsetup();
	}

	@Override
	public int websitecountset() {
		return pageClickDao.websitecountsetup();
	}

	@Override
	public Integer readwebsitecountset() {
		return pageClickDao.readwebsitecountsetup();
	}	
}
