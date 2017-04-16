package com.filefuction.patern;

import java.util.Scanner;

public class Example1 {
	
	public static void main(String args[]){
		
		Scanner ss=new Scanner(System.in);
		
		 int rows=ss.nextInt();
		 
		 for(int i=1;i<=rows;i++){
			 for(int j=1;j<=i;j++){
				 System.out.print(j+"");
			 }
			 System.out.println();
		 }
		
		 ss.close();
	}

}

