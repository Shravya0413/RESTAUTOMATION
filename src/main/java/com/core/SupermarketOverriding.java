package com.core;

public class SupermarketOverriding extends SundayMarketOverriding
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupermarketOverriding obj = new SupermarketOverriding();
		obj.jasmine();
		obj.lilly();
		obj.mums();
		obj.hibiscus();
		obj.rose();

	}
	
	public void rose() {
		System.out.println("rose price 10 rs in SuperMarket");
	}
	public void lilly() {
		System.out.println("lilly");
	}
	public void mums() {
		System.out.println("mums");
	}
}
