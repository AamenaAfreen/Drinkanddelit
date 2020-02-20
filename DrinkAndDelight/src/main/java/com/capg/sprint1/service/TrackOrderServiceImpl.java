package com.capg.sprint1.service;

import com.capg.sprint1.dao.TrackOrderDaoImpl;

public class TrackOrderServiceImpl implements TrackOrderService {
	
	public String trackOrder(String OrderId) {
		TrackOrderDaoImpl trackOrderDaoImplObj = new TrackOrderDaoImpl();
		
		
		return trackOrderDaoImplObj.trackOrder(OrderId);
		
	}

}
