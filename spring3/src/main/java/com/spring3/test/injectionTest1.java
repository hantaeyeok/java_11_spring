package com.spring3.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring3.dto.Store;

public class injectionTest1 {
	public static void main(String[] args) {
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:injectionContext.xml");
		
		Store store1 = ctx1.getBean("store1",Store.class);
		System.out.println("store1 : "+store1.toString());
		
		Store store2 = ctx1.getBean("store2",Store.class);
		System.out.println("store2 : "+store2.toString());
		
		Store store3 = ctx1.getBean("store3",Store.class);
		System.out.println("store3 : "+store3.toString());
		 
	}

}
