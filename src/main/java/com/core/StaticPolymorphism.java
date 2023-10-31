package com.core;

public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPolymorphism obj = new StaticPolymorphism();
		obj.vehicle();
		obj.vehicle("Car");
		obj.vehicle(4);

	}
	public void vehicle() {
		
		System.out.println("I have a 2 wheeler vehicle");
		
	}
	public void vehicle(int wheels) {
		System.out.println("My vehicle is "+ wheels +" wheeler vehicleS");//""+
	}
	public void vehicle(String vehiclename) {
		System.out.println("My vehicle is " + vehiclename);
	}

}
