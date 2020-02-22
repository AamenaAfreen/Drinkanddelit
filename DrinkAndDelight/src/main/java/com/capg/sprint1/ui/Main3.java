package com.capg.sprint1.ui;

import java.util.Scanner;

import com.capg.sprint1.model.ProductOrder;
import com.capg.sprint1.model.RawMaterialOrder;
import com.capg.sprint1.service.TrackOrderServiceImpl;
import com.capg.sprint1.utils.TrackOrderNotFoundException;


public class Main3 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Option \n 1: Raw Material Tracking \n 2: Product Tracking ");
		int option=in.nextInt();
		switch(option)
		{
		
		case 1:
		System.out.println("Raw Material Tracking");
		TrackOrderServiceImpl trackOrderServiceImplObj = new TrackOrderServiceImpl();
		System.out.println("Enter Order Id");
		String OrderId=in.next();
		try
		{
		RawMaterialOrder a= trackOrderServiceImplObj.trackOrder(OrderId);
		System.out.println(a);
		}catch(TrackOrderNotFoundException e) {
			System.err.println(e.getMessage());
		}
		break;
		
		case 2:
			System.out.println("Product Tracking");
			TrackOrderServiceImpl trackOrderServiceImplObj1 = new TrackOrderServiceImpl();
			
			System.out.println("Enter Order Id");
			String OrderId1=in.next();
            try {
			ProductOrder b=trackOrderServiceImplObj1.trackProductOrder(OrderId1);
			System.out.println(b);
            }catch(TrackOrderNotFoundException e)
            {
            	System.err.println(e.getMessage());
            }
			break;
			
			default:System.out.println("Invalid Number");
			
		}
	}

}
