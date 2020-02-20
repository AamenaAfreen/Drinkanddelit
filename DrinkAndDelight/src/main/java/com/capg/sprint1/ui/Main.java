package com.capg.sprint1.ui;

import java.util.Scanner;

import com.capg.sprint1.service.ProductOrderServiceImpl;
import com.capg.sprint1.service.RawMaterialOrderServiceImpl;

public class Main {
static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter Option \n 1: Raw Material Tracking \n 2: Product Tracking ");
		int option=in.nextInt();
		
		switch(option)
		{
		
		case 1:
			System.out.println("Raw Material Order Details");
		RawMaterialOrderServiceImpl rawMaterialOrderServImplObj = new RawMaterialOrderServiceImpl();
		
		System.out.println("Enter Supplier Id");
		String id=in.next();
		System.out.println("Enter Delivery Status"); 
		String deliveryStatus=in.next();
		
		rawMaterialOrderServImplObj.displayOrder(id, deliveryStatus);
		break;
		
		case 2:
			System.out.println("Product Order Details");
			ProductOrderServiceImpl productOrderServiceImplObj = new ProductOrderServiceImpl();
			
			System.out.println("Enter Delivery Id");
			String deliveryId=in.next();
			System.out.println("Enter Delivery Status"); 
			String deliveryStatus1=in.next();
		
			productOrderServiceImplObj.displayPoductOrder(deliveryId,deliveryStatus1);
			break;
			
		default:
			System.out.println("Invalid Number");
		}
	}

}
