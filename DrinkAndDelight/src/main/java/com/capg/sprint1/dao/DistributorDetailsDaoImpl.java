package com.capg.sprint1.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.sprint1.model.DistributorDetails;

public class DistributorDetailsDaoImpl implements DistributorDetailsDao {

	@Override
	public String distributorDetails(String distributorId) {
		
Map<String,DistributorDetails> raws1 =new HashMap<>();
		
DistributorDetails details = new DistributorDetails("12345", "Salwa", "Gangaram,BHEL", 955557635l) ;
DistributorDetails details1 = new DistributorDetails("14325", "Spandana", "Tolichowki,Hyd", 9864754754l) ;
DistributorDetails details2 = new DistributorDetails("78945", "Bhavana", "Nizamabad", 9578214127l) ;
		
		raws1.put(details.getDistributorId(), details);
		raws1.put(details1.getDistributorId(), details1);
		raws1.put(details2.getDistributorId(), details2);
		
		 for(String ord:raws1.keySet())
			{
				if(raws1.get(ord).getDistributorId().equalsIgnoreCase(distributorId)) {
					System.out.println(raws1.get(ord));
				}
			}
		
				return null;
	}

}
