package com.typecasting.example;
class Aq{
	int i=20;
}
class Bq extends Aq{
	int j=40;
	
}
class Cq extends Bq{
	int k=0;
	
}
class Dq extends Cq{
	int c=45;
	void show(){
		System.out.println(c);
	}
}
public class DerivedNarrow {

	public static void main(String[] args) {
		Aq a=new Aq();
		Bq b=(Bq)a;
         Dq dd=(Dq)b;
         dd.show();
	}

}
