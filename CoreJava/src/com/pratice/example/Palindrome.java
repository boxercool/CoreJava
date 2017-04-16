package com.pratice.example;

public class Palindrome {

	public static void main(String[] args) {
	
		int n=121;
		int temp=n;
		int i,sum=0;

	while(n>0){
		i=n%10;
		System.out.println(i);
	
		sum=sum*10+i;
		
		
		System.out.println(sum);
		n=n/10;
		System.out.println(n);
		}
		if(temp==sum)
			System.out.println("panlindrome");
		else
			System.out.println("not");
	}

}
