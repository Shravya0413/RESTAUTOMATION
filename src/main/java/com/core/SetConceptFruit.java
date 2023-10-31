package com.core;

import java.util.HashSet;
import java.util.Iterator;

public class SetConceptFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> obj = new HashSet<String>();
		obj.add("apple");
		obj.add("mango");
		obj.add("pear");
		obj.add("strawberries");
		obj.add("kiwi");
		obj.add("grapees");
		System.out.println(obj);
		obj.add("strawberries");
		obj.add("kiw");
		obj.add("grapees");
		obj.add("rasberry");
		System.out.println(obj);
		 Iterator<String> it = obj.iterator();
	       while(it.hasNext()) 
	       {
	    	System.out.println(it.next());   
	       }
	       
	}

}
