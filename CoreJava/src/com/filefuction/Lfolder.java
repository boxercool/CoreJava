package com.filefuction;

import java.io.File;
import java.io.IOException;

public class Lfolder {
	public static void main(String args[])throws IOException,NullPointerException{
		
		File file=new File("E:/path");
		String[] folder=file.list();
		for(String lists:folder){
			System.out.println(lists);
		}
	}

}
