package com.capg.sprint1.ui;

import java.util.List;
import java.util.Scanner;
import com.capg.sprint1.model.ProductOrder;
import com.capg.sprint1.model.RawMaterialOrder;
import com.capg.sprint1.model.SupplierDetails;
import com.capg.sprint1.service.DetailsServiceImpl;
import com.capg.sprint1.utils.ProductOrderNotFoundException;
import com.capg.sprint1.utils.RawMaterialNotFoundException;
import com.capg.sprint1.utils.SupplierDetailsNotFoundException;

public class Main {
static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		DetailsServiceImpl detailsServiceImpl = new DetailsServiceImpl();
		System.out.println("Enter Option \n 1: Raw Material Order Details \n 2: Product Order Details \n 3 : Supplier Details");
		int option=in.nextInt();
		
		switch(option)
		{
		
		case 1:
		    System.out.println("Raw Material Order Details");
	    	System.out.println("Enter Supplier Id");
		    String id=in.next();
		    System.out.println("Enter Delivery Status"); 
		    String deliveryStatus=in.next();
		    try {
		      List<RawMaterialOrder> orders= detailsServiceImpl.displayOrder(id, deliveryStatus);
		  for(RawMaterialOrder ord:orders) {
			  System.out.println(ord);
		  }
		    }
		  catch(RawMaterialNotFoundException e) {
			  System.err.println(e.getMessage());
		  }
		 		    break;
		
		case 2:
			System.out.println("Product Order Details");
			System.out.println("Enter Delivery Id");
			String deliveryId=in.next();
			System.out.println("Enter Delivery Status"); 
			String deliveryStatus1=in.next();
		try {
			List<ProductOrder> orders1=detailsServiceImpl.displayPoductOrder(deliveryId,deliveryStatus1);
			for(ProductOrder ord1:orders1) {
				  System.out.println(ord1);
			}
		}
		catch(ProductOrderNotFoundException e) {
			 System.err.println(e.getMessage());
		}
		
			
			break;
			
		case 3:
			System.out.println("Supplier Details");
			
			System.out.println("Enter Supplier Id");
			String supplierId=in.next();
			try {
			List<SupplierDetails> orders2=detailsServiceImpl.displaySupplierDetails(supplierId);
			for(SupplierDetails ord2:orders2) {
				  System.out.println(ord2);
				  
			}

			}
			catch(SupplierDetailsNotFoundException a) {
				 System.err.println(a.getMessage());
			}
		
			break;
			
		default:
			System.out.println("Invalid Number");
		}
	}

}
