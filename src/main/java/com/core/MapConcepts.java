package com.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Map obj = new HashMap();
   
   obj.put(1, "Shravya");
   obj.put(2, "Rana");
   obj.put(3, "Vedant");
   obj.put(4, "Prashanth");
   obj.put(5, "Ravi");
   obj.put(5, "Rama");
 /* for(Map.Entry m:(Map.Entry)obj.entrySet()) 
   {
	   System.out.println(m.getKey()+"  "+m.getValue());
	   
   }*/
   
   System.out.println(obj);
   Set seobj = obj.entrySet();//converted map to set with help of Iterator
   Iterator it = seobj.iterator();//set to iterator
   while(it.hasNext()) {
	Map.Entry ment=(Map.Entry)it.next();//typecasting to iterator
	  System.out.println(ment.getKey()+ "   " +ment.getValue());
		   
	   }
	   
   }
	}


