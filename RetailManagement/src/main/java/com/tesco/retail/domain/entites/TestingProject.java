package com.tesco.retail.domain.entites;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tesco.retail.dao.implementation.ClearanceSaleDAO;
import com.tesco.retail.dao.implementation.CustomerDAO;
import com.tesco.retail.dao.implementation.ProductDiscountDAO;
import com.tesco.retail.dao.implementation.FeedbackDAO;
import com.tesco.retail.dao.implementation.InventoryDAO;
import com.tesco.retail.dao.implementation.ProductDAO;
import com.tesco.retail.dao.implementation.ShippingDAO;
import com.tesco.retail.dao.implementation.ProductStatusDAO;

public class TestingProject {

	
	public static void main(String[] args) {
		
	ClearanceSaleDAO clearanceSaleDAO=new ClearanceSaleDAO();
	
	List<ClearanceSale> clearanceSales=clearanceSaleDAO.getsale();
	List<Integer> ids=new ArrayList<Integer>();
	for(ClearanceSale sale:clearanceSales)
	{
		ids.add(sale.getClearanceSaleId());
		System.out.println();
	}
	
	}
}