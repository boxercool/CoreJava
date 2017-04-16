package com.filefuction;

import com.filefuction.SingleObject;
public class SingletonPatternDemo {
	   public static void main(String[] args) {

		      //illegal construct
		      //Compile Time Error: The constructor SingleObject() is not visible
		      //SingleObject object = new SingleObject();

		      //Get the only object available
		   try {     
		   SingleObject object = SingleObject.getInstance();
	
				SingleObject obj=(SingleObject) object.clone();
				obj.showMessage();
			
		      //show the message
		      object.showMessage();
		   } catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
		}
