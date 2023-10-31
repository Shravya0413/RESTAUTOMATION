package com.core;

public class StaticPoymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPoymorphism2 obj = new StaticPoymorphism2();
		obj.cars();
		obj.cars("BMW");
		obj.cars(5, "gas");

	}
	
	public void cars() {
		
		System.out.println("Maurthi");
	}
	public void cars(String carname) {
		System.out.println("My car name " + carname);
		
	}
public void cars(int seats,String typeoffuel) 
{
	System.out.println("My car seat count is"+  seats);
	System.out.println("My car typeoffuel is"+ typeoffuel);
}
}
