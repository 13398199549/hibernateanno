package org.framestudy.hibernatexml.o2o.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.hibernatexml.bean.PagerBean;
import org.framestudy.hibernatexml.o2o.HusbandBean;
import org.framestudy.hibernatexml.o2o.dao.IHusbandDao;
import org.framestudy.hibernatexml.o2o.service.IHusbandService;
import org.springframework.stereotype.Service;
@Service
public class HusbandServiceImpl implements IHusbandService {

	@Resource
	private IHusbandDao husbandDaoImpl;
	
	@Override
	public void saveHusband(HusbandBean husband) {
		// TODO Auto-generated method stub
		husbandDaoImpl.saveHusband(husband);
	}

	@Override
	public void udpateHusband(HusbandBean husband) {
		// TODO Auto-generated method stub
		husbandDaoImpl.udpateHusband(husband);
	}

	@Override
	public void deleteHusband(HusbandBean husband) {
		// TODO Auto-generated method stub
		husbandDaoImpl.deleteHusband(husband);
	}

	@Override
	public HusbandBean getHusbandById(String id) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.getHusbandById(id);
	}

	@Override
	public List<?> listHusbandByWifeName(String wifeName) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.listHusbandByWifeName(wifeName);
	}

	@Override
	public PagerBean listHusbandByParams2PagerBean(Map params, PagerBean pager) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.listHusbandByParams2PagerBean(params, pager);
	}

}
