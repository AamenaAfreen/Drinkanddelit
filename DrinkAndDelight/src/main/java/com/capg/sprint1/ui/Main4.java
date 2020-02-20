package com.capg.sprint1.ui;

import java.util.Scanner;

import com.capg.sprint1.service.DistributorDetailsServiceImpl;

public class Main4 {

	public static void main(String[] args) {
		DistributorDetailsServiceImpl distributorDetailsServiceobj = new DistributorDetailsServiceImpl();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Distributor Id");
		String distributorId=in.nextLine();
		
		distributorDetailsServiceobj.distributorDetails(distributorId);

	}

}
