package com.spring3.dto;

public class Kiwi implements Fruits{
	private int price;

	@Override
	public String toString() {
		return "kiwi [price=" + price + "]";
	}

	public Kiwi(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
