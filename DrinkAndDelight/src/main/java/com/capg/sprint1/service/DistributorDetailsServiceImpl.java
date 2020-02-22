package com.capg.sprint1.service;

import com.capg.sprint1.dao.DistributorDetailsDaoImpl;
import com.capg.sprint1.model.DistributorDetails;
import com.capg.sprint1.utils.DistributerNotFoundException;

public class DistributorDetailsServiceImpl implements DistributorDetailsService{

	@Override
	public DistributorDetails distributorDetails(String distributorId) {
		DistributorDetailsDaoImpl distributorDetailsDaoImplObj = new DistributorDetailsDaoImpl();
	
		DistributorDetails d=distributorDetailsDaoImplObj.distributorDetails(distributorId);
		if(d==null){
			throw new DistributerNotFoundException("No Distributer with id : "+distributorId);
		}
		return d;
	}
	

}
