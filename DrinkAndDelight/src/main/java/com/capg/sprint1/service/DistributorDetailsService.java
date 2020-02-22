package com.capg.sprint1.service;

import com.capg.sprint1.model.DistributorDetails;
import com.capg.sprint1.utils.DistributerNotFoundException;

public interface DistributorDetailsService {
	
public DistributorDetails distributorDetails(String distributorId) throws DistributerNotFoundException;
}
