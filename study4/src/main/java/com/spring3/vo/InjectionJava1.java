package com.spring3.vo;

import com.spring3.dto.Store;

//생성자로 주입(생성자로 만들어서 주입)
public class InjectionJava1{
	private Store store;

	public InjectionJava1(Store store) {

		this.store = store;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	
}
