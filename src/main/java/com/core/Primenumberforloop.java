package com.core;

public class Primenumberforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		for(int i=1;i<=10;i++)//i=1;1<=10
		{
		int count =0;//count=0
		for(int j=i;j>=1;j--)//j=1;1>=1
		{
		if((i%j)==0)//1%1=0reminder
		{

		count = count+1;//0+1=1
		}//ending if condition

		}//ending nested for loop
		if(count==2){
		System.out.println(i);
		}
		}//ending first forloop
		

	}

}
