

package com.capg.sprint1.dao;

import java.util.List;

import com.capg.sprint1.model.ProductOrder;
import com.capg.sprint1.model.RawMaterialOrder;
import com.capg.sprint1.model.SupplierDetails;
import com.capg.sprint1.utils.DistributerNotFoundException;
import com.capg.sprint1.utils.ProductOrderNotFoundException;
import com.capg.sprint1.utils.RawMaterialNotFoundException;

public interface DetailsDao {
	
	public List<RawMaterialOrder> displayOrder(String supplierId,String deliveryStatus) throws RawMaterialNotFoundException;
	public List<ProductOrder> displayPoductOrder(String deliveryId, String deliveryStatus1) throws ProductOrderNotFoundException;
	public List<SupplierDetails> displaySupplierDetails(String supplierId)throws DistributerNotFoundException;


}
