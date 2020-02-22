package com.capg.sprint1.service;

import com.capg.sprint1.dao.TrackOrderDaoImpl;
import com.capg.sprint1.model.ProductOrder;
import com.capg.sprint1.model.RawMaterialOrder;
import com.capg.sprint1.utils.TrackOrderNotFoundException;

public class TrackOrderServiceImpl implements TrackOrderService {
	
	public RawMaterialOrder trackOrder(String OrderId) {
		TrackOrderDaoImpl trackOrderDaoImplObj = new TrackOrderDaoImpl();
		
		RawMaterialOrder a=trackOrderDaoImplObj.trackOrder(OrderId);
		if(a==null)
		{
			throw new TrackOrderNotFoundException("No Order with id : "+OrderId); 
		}
		return a;
	}

	

	@Override
	public ProductOrder trackProductOrder(String OrderId1) {
		TrackOrderDaoImpl trackOrderDaoImplObj = new TrackOrderDaoImpl();
		ProductOrder b= trackOrderDaoImplObj.trackProductOrder(OrderId1);
		if(b==null)
		{
			throw new TrackOrderNotFoundException("No Order with id : "+OrderId1); 
	}
		return b;

}
}
