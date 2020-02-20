package com.capg.sprint1.service;

import com.capg.sprint1.dao.DistributorDetailsDaoImpl;

public class DistributorDetailsServiceImpl implements DistributorDetailsService{

	@Override
	public String distributorDetails(String distributorId) {
		DistributorDetailsDaoImpl distributorDetailsDaoImplObj = new DistributorDetailsDaoImpl();
	
		return distributorDetailsDaoImplObj.distributorDetails(distributorId);
	}
	

}
