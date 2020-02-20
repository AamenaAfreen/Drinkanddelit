package com.capg.sprint1.ui;

import java.util.Scanner;

import com.capg.sprint1.service.TrackOrderServiceImpl;
import com.capg.sprint1.service.TrackProductOrderServiceImpl;

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

		trackOrderServiceImplObj.trackOrder(OrderId);
		break;
		
		case 2:
			System.out.println("Product Tracking");
			TrackProductOrderServiceImpl trackProductOrderServiceImplObj = new TrackProductOrderServiceImpl();
			
			System.out.println("Enter Order Id");
			String OrderId1=in.next();

			trackProductOrderServiceImplObj.trackProductOrder(OrderId1);
			break;
			
			default:System.out.println("Invalid Number");
			
		}
	}

}
