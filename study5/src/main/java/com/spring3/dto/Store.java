package com.spring3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Store {

	private String storeNum;
	private String storeName;
	public Store() {}
	public Store(String storeNum, String storeName) {
		super();
		this.storeNum = storeNum;
		this.storeName = storeName;
	}	
	
	
	} 
	
