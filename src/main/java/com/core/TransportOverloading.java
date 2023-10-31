package com.core;

public class TransportOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransportOverloading obj = new TransportOverloading();
		obj.vehicle();
		obj.vehicle(6);
		obj.vehicle("Infinity", 5);
	}

	public void vehicle() {
		System.out.println("vehicle");
	}
	public void vehicle(int persons) {
		System.out.println("We can go on Vehicle" + persons);
	}
	public void vehicle(String vehiclename,int persons) {
	System.out.println("Vehicle name is" +vehiclename);
	System.out.println("vehicle carry persons" +persons);
	}
}
	

