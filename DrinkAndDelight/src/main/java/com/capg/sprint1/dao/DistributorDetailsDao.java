package com.capg.sprint1.dao;

import com.capg.sprint1.model.DistributorDetails;
import com.capg.sprint1.utils.DistributerNotFoundException;

public interface DistributorDetailsDao {
	public DistributorDetails distributorDetails(String distributorId) throws DistributerNotFoundException;
}
