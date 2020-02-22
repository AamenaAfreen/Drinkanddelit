package com.capg.sprint1.service;

import com.capg.sprint1.model.ProductOrder;
import com.capg.sprint1.model.RawMaterialOrder;

public interface TrackOrderService {
	public RawMaterialOrder trackOrder(String OrderId);
	public ProductOrder trackProductOrder(String OrderId1);

}
