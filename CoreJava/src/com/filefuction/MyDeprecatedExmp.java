package com.filefuction;

public class MyDeprecatedExmp {

	@Deprecated
	public void show(){
		System.out.println("deprest:");
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]){
		MyDeprecatedExmp s=new MyDeprecatedExmp();
		s.show();
	}
}
