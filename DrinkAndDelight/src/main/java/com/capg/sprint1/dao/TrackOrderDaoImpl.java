package com.capg.sprint1.dao;

import java.util.HashMap;

import com.capg.sprint1.model.RawMaterialOrder;

import java.util.*;

public class TrackOrderDaoImpl implements TrackOrderDao {

public String trackOrder(String orderId) {
		
	   Map<String,RawMaterialOrder> list=new HashMap<>();
		
		RawMaterialOrder order1=new RawMaterialOrder("12345","sugar","602532",102.4,"123",new Date(), new Date(2020, 0, 15),121.0,146.0,"ontheWay","434");
		list.put(order1.getOrderId(), order1);
		RawMaterialOrder order2=new RawMaterialOrder("56243","salt","602424",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"ontheWay","464");
		list.put(order2.getOrderId(), order2);

		 System.out.println(list.get(orderId));

		
	
		
		return null;
	}

}
