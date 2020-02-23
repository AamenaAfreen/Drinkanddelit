package com.capg.sprint1.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.capg.sprint1.model.ProductOrder;
import com.capg.sprint1.model.RawMaterialOrder;
import com.capg.sprint1.model.SupplierDetails;

public class DetailsDaoImpl implements DetailsDao {
	

	public static Map<String,RawMaterialOrder> raws =new HashMap<>();
	Map<String,ProductOrder> list=new HashMap<>();
	Map<String,SupplierDetails> raws1 =new HashMap<>();

	public void detailsDaoimpl()
	{
	account();
    }
	public void account() {
	

	
	RawMaterialOrder order=new RawMaterialOrder("53553","sugar","602532",102.4,"123",new Date(), new Date(2020, 0, 15),121.0,146.0,"ontheWay","434");
	RawMaterialOrder order1=new RawMaterialOrder("56243","salt","602424",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"ontheWay","464");
	RawMaterialOrder order11=new RawMaterialOrder("56245","Tea powder","602424",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"delivered","434");
	RawMaterialOrder order12=new RawMaterialOrder("56243","coffee powder","602424",101.4,"128",new Date(), new Date(2020, 11, 20),120.0,140.0,"delivered","414");
	RawMaterialOrder order13=new RawMaterialOrder("56243","milk","602424",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"delivered","404");
    ProductOrder order3=new ProductOrder("12345","delivered","sugar",102.4,102.4,106.0,123.9,"13456",new Date(), new Date(2020, 1, 15),new Date(2020,10, 15),"fine", new Date(2020, 1, 15),"12475");
	ProductOrder order4=new ProductOrder("12865","onTheWay","salt",100.4,103.4,146.0,143.9,"13443",new Date(), new Date(2020, 1, 15),new Date(2020,10, 15),"fine", new Date(2020, 1, 15),"45921");
	SupplierDetails details = new SupplierDetails("12345", "Bhargav", "Gangaram,BHEL", 9547217635l) ;
	SupplierDetails details1 = new SupplierDetails("14325", "Afreen", "Tolichowki,Hyd", 9864754754l) ;
	SupplierDetails details2 = new SupplierDetails("78945", "Bhavana", "Nizamabad", 9578214127l) ;


	
	//public DetailsDaoImpl() {
		raws.put(order.getOrderId(), order);
		raws.put(order1.getOrderId(), order1);
		raws.put(order11.getOrderId(), order11);
		raws.put(order12.getOrderId(), order12);
		raws.put(order13.getOrderId(), order13);
		list.put(order3.getOrderId(), order3);
		list.put(order4.getOrderId(), order4);
		raws1.put(details.getSupplierId(), details);
		raws1.put(details1.getSupplierId(), details1);
		raws1.put(details2.getSupplierId(), details2);
		
	}

	@Override
	public List<RawMaterialOrder> displayOrder(String supplierId, String deliveryStatus) {
		
		List<RawMaterialOrder> orders=new ArrayList<>();
				boolean b=false;
			 for(String ord:raws.keySet())
				{
					if(raws.get(ord).getSupplierId().equalsIgnoreCase(supplierId) && raws.get(ord).getDeliveryStatus().equalsIgnoreCase(deliveryStatus))
					{
						orders.add(raws.get(ord));
					}
		 }
			
			 if(b)
			 {
					return orders;
			 }
					 else
					 {
						 return null;
					 }
	}

	@Override
	public List<ProductOrder> displayPoductOrder(String deliveryId, String deliveryStatus1) {
			List<ProductOrder> orders1=new ArrayList<>();
			boolean b=false;
			 for(String data:list.keySet())
				{
					if(list.get(data).getDistributorId().equalsIgnoreCase(deliveryId) && list.get(data).getDeliveryStatus().equalsIgnoreCase(deliveryStatus1))
					{
						
						orders1.add(list.get(data));
					}
					
		 }
			 if(b)
			 {
					return orders1;
			 }
					 else
					 {
						 return null;
					 }
	}

	@Override
	public List<SupplierDetails> displaySupplierDetails(String supplierId) {
		// TODO Auto-generated method stub
		List<SupplierDetails> orders2=new ArrayList<>();

		boolean b=false;
		 for(String ord:raws1.keySet())
			{
			 
				if(raws1.get(ord).getSupplierId().equalsIgnoreCase(supplierId))
				{
					b=true;
					orders2.add(raws1.get(ord));
				}
			}
		 if(b)
		return orders2;
		 else
			 return null;
	}

}
