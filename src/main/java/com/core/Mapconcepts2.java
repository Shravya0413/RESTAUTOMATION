package com.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import groovy.util.MapEntry;

public class Mapconcepts2 {

	private static Set setobj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map  obj = new HashMap();
		obj.put(1, "Red");
		obj.put(2, "Blue");
		obj.put(3, "Green");
		obj.put(4,"yellow");
		
		System.out.println(obj);
		obj.put(5,"yellow");
		Set setobj= obj.entrySet();
		Iterator it = setobj.iterator();
		while(it.hasNext()) 
		{
			
			Map.Entry ment=(Map.Entry)it.next();//typecasting to iterator
			  System.out.println(ment.getKey()+ "   " +ment.getValue());
				   	
		}
	}

}
