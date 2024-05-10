package com.spring3.vo;

import java.util.ArrayList;

import com.spring3.dto.Store;

public class Maker {
	private String part;
	private int partNum;
	private ArrayList<Store> stores;
	public Maker(String part, int partNum, ArrayList<Store> stores) {
		super();
		this.part = part;
		this.partNum = partNum;
		this.stores = stores;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public int getPartNum() {
		return partNum;
	}
	public void setPartNum(int partNum) {
		this.partNum = partNum;
	}
	public ArrayList<Store> getStores() {
		return stores;
	}
	public void setStores(ArrayList<Store> stores) {
		this.stores = stores;
	}
	
	

	
}
