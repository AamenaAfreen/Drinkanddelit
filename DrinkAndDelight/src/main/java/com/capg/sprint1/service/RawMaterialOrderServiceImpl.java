package com.capg.sprint1.service;

import com.capg.sprint1.dao.RawMaterialOrderDaoImpl;

public class RawMaterialOrderServiceImpl implements RawMaterialOrderService {

	@Override
	public String displayOrder(String supplierId, String deliveryStatus) {
		RawMaterialOrderDaoImpl rawMaterialOrderDaoImplObj=new RawMaterialOrderDaoImpl();
		
		return rawMaterialOrderDaoImplObj.displayOrder(supplierId, deliveryStatus) ;
	}

}
