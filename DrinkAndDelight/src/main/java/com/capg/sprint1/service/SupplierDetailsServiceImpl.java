package com.capg.sprint1.service;

import com.capg.sprint1.dao.SupplierDetailsDaoImpl;

public class SupplierDetailsServiceImpl implements SupplierDetailsService {
	
	@Override
	public String displaySupplierDetails(String supplierId) {
		
		SupplierDetailsDaoImpl supplierDetailsDaoImplObj = new SupplierDetailsDaoImpl();
		
		return supplierDetailsDaoImplObj.displaySupplierDetails(supplierId);
	}

	
}
