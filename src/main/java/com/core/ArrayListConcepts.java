package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Rama");
		obj.add("Krishna");
		obj.add("Hari");
		obj.add("Gopi");
		obj.add("Murali");
		obj.add("Ravi");
		
		System.out.println(obj);
		obj.add("Krishna");
		obj.add("Hari");
		System.out.println(obj);
		obj.add("Krishna");
		System.out.println(obj);
		System.out.println(obj.get(2));
		System.out.println(obj.get(7));
		System.out.println(obj.get(4));
		Iterator<String> it = obj.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
