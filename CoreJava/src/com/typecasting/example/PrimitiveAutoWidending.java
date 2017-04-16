package com.typecasting.example;


public class PrimitiveAutoWidending {
	public static void main(String args[]){
		byte c=2;
		short d=c;
		int f=d;
		long g=f;
		float h=g;
		double j=h;
		System.out.println(j);
		double k=40;
		int l=(int)k;
		System.out.println(l);
	}

}
