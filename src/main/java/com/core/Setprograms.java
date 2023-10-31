package com.core;

import java.util.HashSet;
import java.util.Iterator;


public class Setprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> obj = new HashSet<String>();
		obj.add("Ravi");
		obj.add("Prashanth");
		obj.add("Reyansh");
		obj.add("Vedant");
		obj.add("Rana");
		obj.add("myra");
		obj.add("kiara");
		obj.add("Arjun");
		obj.add("Krishiv");
		obj.add("Pranav");
		System.out.println(obj);
        obj.add("manoj");
        obj.add("Ravi");
        obj.add("myra");
        System.out.println(obj);
       Iterator<String> it = obj.iterator();
       while(it.hasNext()) 
       {
    	System.out.println(it.next());   
       }
       
	}
}


