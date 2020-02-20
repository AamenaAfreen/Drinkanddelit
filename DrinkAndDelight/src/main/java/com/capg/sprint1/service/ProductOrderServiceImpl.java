package com.capg.sprint1.service;

import com.capg.sprint1.dao.ProductOrderDaoImpl;

public class ProductOrderServiceImpl implements ProductOrderService{

	@Override
	public String displayPoductOrder(String deliveryId, String deliveryStatus1) {
		ProductOrderDaoImpl productOrderDaoImplObj = new ProductOrderDaoImpl();
		return productOrderDaoImplObj.displayPoductOrder(deliveryId,deliveryStatus1);
	}

}
