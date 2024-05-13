package com.spring3.dto;

public class Shop {
	private String shopNmae;
	private Product product;		//product로 부터 상속받은 pencil을 받으려고 필드주입을 함.
	
	public Shop() {}
	public Shop(String shopNmae, Product product) {
		super();
		this.shopNmae = shopNmae;
		this.product = product;
	}
	@Override
	public String toString() {
		return "Shop [shopNmae=" + shopNmae + ", product=" + product + "]";
	}
	public String getShopNmae() {
		return shopNmae;
	}
	public void setShopNmae(String shopNmae) {
		this.shopNmae = shopNmae;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}


}
