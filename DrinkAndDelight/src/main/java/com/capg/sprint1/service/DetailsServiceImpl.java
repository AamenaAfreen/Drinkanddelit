package com.capg.sprint1.service;
import java.util.List;

import com.capg.sprint1.dao.DetailsDaoImpl;
import com.capg.sprint1.model.ProductOrder;
import com.capg.sprint1.model.RawMaterialOrder;
import com.capg.sprint1.model.SupplierDetails;
import com.capg.sprint1.utils.DistributerNotFoundException;
import com.capg.sprint1.utils.ProductOrderNotFoundException;
import com.capg.sprint1.utils.RawMaterialNotFoundException;
import com.capg.sprint1.utils.SupplierDetailsNotFoundException;

public class DetailsServiceImpl implements DetailsService {
	DetailsDaoImpl detailsDaoImplObj=new DetailsDaoImpl();
	
	@Override
	public List<RawMaterialOrder> displayOrder(String supplierId, String deliveryStatus) throws RawMaterialNotFoundException{
		
		List<RawMaterialOrder> a= detailsDaoImplObj.displayOrder(supplierId, deliveryStatus) ;
		if(a==null)
		{
			throw new RawMaterialNotFoundException("No Order with id : "+supplierId); 
		}
		return a;
	}
	

	@Override
	public List<ProductOrder> displayPoductOrder(String deliveryId, String deliveryStatus1) throws ProductOrderNotFoundException {
		
		List<ProductOrder> b= detailsDaoImplObj.displayPoductOrder(deliveryId,deliveryStatus1);
		if(b==null)
		{
			throw new ProductOrderNotFoundException("No Order with id : "+deliveryId); 
		}
		return b;
	}

	@Override
	public List<SupplierDetails> displaySupplierDetails(String supplierId) throws DistributerNotFoundException{
		
		List<SupplierDetails> c= detailsDaoImplObj.displaySupplierDetails(supplierId);
			
	if(c==null)
	{
		throw new SupplierDetailsNotFoundException("No Order with id : "+supplierId); 
	}
	return c
			;

}


	
}

