package com.array;

public class AddArray {

	public static void main(String[] args) {
		int a[][]={{1,2},{1,2}};
		int b[][]={{2,1},{2,1}};
	int c[][]=new int[2][2];
	
	for(int i=0;i<2;i++){
		System.out.print("{");
		for(int j=0;j<2;j++){
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(",");
			System.out.print(c[i][j]+"");
			
			
		}	
		
		System.out.print("}");
	}
	}

}
