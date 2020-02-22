package com.capg.sprint1.dao;

import com.capg.sprint1.model.ProductOrder;
import com.capg.sprint1.model.RawMaterialOrder;

import java.util.*;


public class TrackOrderDaoImpl implements TrackOrderDao {
	Map<String,RawMaterialOrder> list=new HashMap<>();
	 Map<String,ProductOrder> list1=new HashMap<>();
	RawMaterialOrder order1=new RawMaterialOrder("12345","sugar","602532",102.4,"123",new Date(), new Date(2020, 0, 15),121.0,146.0,"ontheWay","434");
	RawMaterialOrder order2=new RawMaterialOrder("56243","salt","602424",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"ontheWay","464");
	ProductOrder order3=new ProductOrder("12345","onTheWay", "sugar",102.4,102.4,106.0,123.9,"13456",new Date(), new Date(2020, 1, 15),new Date(2020,10, 15),"fine", new Date(2020, 1, 15),"12475");
	ProductOrder order4=new ProductOrder("12865","delivered","salt",100.4,103.4,146.0,143.9,"13443",new Date(), new Date(2020, 1, 15),new Date(2020,10, 15),"fine", new Date(2020, 1, 15),"45921");
	
	 
	public TrackOrderDaoImpl(){
		list.put(order1.getOrderId(), order1);
		list.put(order2.getOrderId(), order2);
		list1.put(order3.getOrderId(), order3);
		list1.put(order4.getOrderId(), order4);
	}
public RawMaterialOrder trackOrder(String orderId) {
		return list.get(orderId);	   
		 }

@Override
public ProductOrder trackProductOrder(String OrderId1) {
	// TODO Auto-generated method stub
    return list1.get(OrderId1);
	
}

}
