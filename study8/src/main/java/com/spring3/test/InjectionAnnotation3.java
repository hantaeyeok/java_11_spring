package com.spring3.test;

import com.spring3.dto.Market;

public class InjectionAnnotation3 {
	private int data1;
	private String data2;
	private Market marketbean1;
	public InjectionAnnotation3() {}
	public InjectionAnnotation3(int data1, String data2, Market marketbean1) {
		super();
		this.data1 = data1;
		this.data2 = data2;
		this.marketbean1 = marketbean1;
	}
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	public Market getMarketbean1() {
		return marketbean1;
	}
	public void setMarketbean1(Market marketbean1) {
		this.marketbean1 = marketbean1;
	}
	@Override
	public String toString() {
		return "injectionAnnotation3 [data1=" + data1 + ", data2=" + data2 + ", marketbean1=" + marketbean1 + "]";
	}
	
	
	
}
