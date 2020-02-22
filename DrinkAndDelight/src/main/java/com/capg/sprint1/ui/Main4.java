package com.capg.sprint1.ui;

import java.util.Scanner;

import com.capg.sprint1.model.DistributorDetails;
import com.capg.sprint1.service.DistributorDetailsServiceImpl;
import com.capg.sprint1.utils.DistributerNotFoundException;

public class Main4 {

	public static 
	void main(String[] args) {
		DistributorDetailsServiceImpl distributorDetailsServiceobj = new DistributorDetailsServiceImpl();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Distributor Id");
		String distributorId=in.nextLine();
		try{
			DistributorDetails d=distributorDetailsServiceobj.distributorDetails(distributorId)	;
			System.out.println(d);
		}
		catch (DistributerNotFoundException e) {
			System.err.println(e.getMessage());
		}
		

	}

}
