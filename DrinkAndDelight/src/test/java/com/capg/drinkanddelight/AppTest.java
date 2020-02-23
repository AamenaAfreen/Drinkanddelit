package com.capg.drinkanddelight;
import java.util.Map;
import java.util.Date;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.sprint1.dao.DetailsDaoImpl;
import com.capg.sprint1.model.RawMaterialOrder;
import com.capg.sprint1.service.DetailsServiceImpl;


public class AppTest 
{
	
	static DetailsDaoImpl detailsDaoImplObj=new DetailsDaoImpl();
	static DetailsServiceImpl detailsServiceImpl = new DetailsServiceImpl();
	static Map<String,RawMaterialOrder> raws =DetailsDaoImpl.raws;
	static RawMaterialOrder order;
	
	@BeforeAll
	public static void account() {
		
		RawMaterialOrder order=new RawMaterialOrder("53553","sugar","602532",102.4,"123",new Date(), new Date(2020, 0, 15),121.0,146.0,"ontheWay","434");
 raws.put(order.getOrderId(), order);
	}
	
    @Test
    public void shouldAnswerWithTrue()
    {
   // assertEquals(order,);
    }
}
