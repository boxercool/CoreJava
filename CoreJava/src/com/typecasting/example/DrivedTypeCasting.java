package com.typecasting.example;

class A{
	int i=20;
}
class B extends A{
	int j=40;
	
}
class C extends B{
	int k=0;
	
}
class D extends C{
	int c=45;
	void show(){
		System.out.println(c);
	}
}

public class DrivedTypeCasting {

	public static void main(String[] args) {
		D d=new D();
		C c=d;
		B b=c;
		A s=b;
		d.show();
	}

}
