package com.capg.sprint1.service;

import com.capg.sprint1.dao.TrackProductOrderDaoImpl;

public class TrackProductOrderServiceImpl implements TrackProductOrderService {

	@Override
	public String trackProductOrder(String OrderId1) {
		TrackProductOrderDaoImpl trackProductOrderDaoImplObj = new TrackProductOrderDaoImpl();
		return trackProductOrderDaoImplObj.trackProductOrder(OrderId1);
	}

	

	
}
