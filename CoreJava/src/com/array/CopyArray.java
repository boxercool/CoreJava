package com.array;

public class CopyArray {

	public static void main(String[] args) {
		
		int john=10;
	
		int a[][]={{2,1},
				{1,4,5,78,45}};
	
		int b[][]=a.clone();
		
		/*for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}*/
		System.out.print("{");
		for(int c[]:a){
			System.out.print("{");
			for(int d:c){
			System.out.print(d);
			}
			System.out.print("}");
			System.out.println(",");
		}
		System.out.print("}");
		
	}

}
