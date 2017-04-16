package com.pratice.example;

public class PerferctNumber {

	public static void main(String[] args) {
		
		int n=14;
		boolean b=isPerfect(n);
		if(b)
			System.out.println("Perfect ");
		
		else
			System.out.println("not perfect");
		
	
	}


	public static boolean isPerfect(int n){
		
		int sum=0;
			for(int i=1;i<=n/2;i++){
				if(i%n==0)
					sum=sum+i;
				System.out.println(" 1");
			}
			if(n==sum)
				return true;

			return false;
		}
}