package com.capg.sprint1.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.capg.sprint1.model.ProductOrder;

public class ProductOrderDaoImpl implements ProductOrderDao{

	@Override

	public String displayPoductOrder(String distributorId, String deliveryStatus1) {
		
		Map<String,ProductOrder> list=new HashMap<>();
		
	       ProductOrder order3=new ProductOrder("12345","delivered","sugar",102.4,102.4,106.0,123.9,"13456",new Date(), new Date(2020, 1, 15),new Date(2020,10, 15),"fine", new Date(2020, 1, 15),"12475");
			list.put(order3.getOrderId(), order3);
			ProductOrder order4=new ProductOrder("12865","onTheWay","salt",100.4,103.4,146.0,143.9,"13443",new Date(), new Date(2020, 1, 15),new Date(2020,10, 15),"fine", new Date(2020, 1, 15),"45921");
			list.put(order4.getOrderId(), order4);
		
			 for(String data:list.keySet())
				{
					if(list.get(data).getDistributorId().equalsIgnoreCase(distributorId) && list.get(data).getDeliveryStatus().equalsIgnoreCase(deliveryStatus1))
					{
						System.out.println(list.get(data));
					}
					
		 }
		return null;
	}

}
