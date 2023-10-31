package com.core;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=5;
		 int b=6;
		 int c=4;
		 int d=3;
		 int e= 2;
		 int f=7;
		 int g=8;
		 int h=9;
		 int i=4;
		 System.out.println((a>d)&&(f>e));//t && t = true
		 System.out.println((b>f)&&(i>d));// f&&t = false
		 System.out.println((i<b)||(f<h));// t||t = true
		 System.out.println((i>h)||(g>h));//f||f = false

	}

}
