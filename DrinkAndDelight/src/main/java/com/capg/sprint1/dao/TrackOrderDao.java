package com.capg.sprint1.dao;

import com.capg.sprint1.model.ProductOrder;
import com.capg.sprint1.model.RawMaterialOrder;

public interface TrackOrderDao {
	public RawMaterialOrder trackOrder(String OrderId);
	public ProductOrder trackProductOrder(String OrderId1);

}
