package com.spring3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class Store {

	private int storeNum;
	private String storeName;
	public Store() {}
	public Store(int storeNum, String storeName) {
		super();
		this.storeNum = storeNum;
		this.storeName = storeName;
	}
	public int getStoreNum() {
		return storeNum;
	}
	public void setStoreNum(int storeNum) {
		this.storeNum = storeNum;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	@Override
	public String toString() {
		return "Store [storeNum=" + storeNum + ", storeName=" + storeName + "]";
	}	
	
	
	} 
	
