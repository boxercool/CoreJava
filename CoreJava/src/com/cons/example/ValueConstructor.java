package com.cons.example;

public class ValueConstructor {

	public static void main(String[] args) {
	
		Student stu=new Student(4);
		Student stu1=new Student(4,1.1f);
		stu.Show(7);
	}

}


class Student{
	int d=10;
	
	public Student(int j)
	{
		System.out.println("Int value"+j);
	}
	public Student (int k,float h){
		System.out.println(k+"Float "+h);
	}
	
	public void Show(Integer va){
		this.d=va;
		System.out.println("Value of method:"+va);
		
	}
}