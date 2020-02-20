package com.capg.sprint1.dao;
import java.util.*;
import com.capg.sprint1.model.SupplierDetails;

public class SupplierDetailsDaoImpl implements SupplierDetailsDao{
	
	public String displaySupplierDetails(String supplierId) {
		Map<String,SupplierDetails> raws1 =new HashMap<>();
		
		SupplierDetails details = new SupplierDetails("12345", "Bhargav", "Gangaram,BHEL", 9547217635l) ;
		SupplierDetails details1 = new SupplierDetails("14325", "Afreen", "Tolichowki,Hyd", 9864754754l) ;
		SupplierDetails details2 = new SupplierDetails("78945", "Bhavana", "Nizamabad", 9578214127l) ;
		
		raws1.put(details.getSupplierId(), details);
		raws1.put(details1.getSupplierId(), details1);
		raws1.put(details2.getSupplierId(), details2);
		
		 for(String ord:raws1.keySet())
			{
				if(raws1.get(ord).getSupplierId().equalsIgnoreCase(supplierId)) {
					System.out.println(raws1.get(ord));
				}
			}
		return null;
	}

}

