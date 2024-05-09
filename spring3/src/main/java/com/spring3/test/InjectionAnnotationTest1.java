package com.spring3.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.spring3.dto.Market;
import com.spring3.dto.Shop;
import com.spring3.dto.Store;

@Service
public class InjectionAnnotationTest1 {

	@Autowired
	private InjectionAnnotation1 obj1;
	
	@Autowired
	private InjectionAnnotation2 obj2;
	
	@Autowired
	private InjectionAnnotation3 obj3;
	
	@Autowired
	private InjectionAnnotation4 obj4;
	
	public Store geStore() { 
		return obj1.getStoreBean1();
	}
	
	public Shop getShop() {
		return obj2.getShopBean1();
	}
	
	public Market getMarket() { 
		return obj3.getMarketbean1();
	}
	
	public int getData1(){
		return obj4.getData1();
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
