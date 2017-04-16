package com.filefuction.serialize;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML  implements Serializable{

	public static void main(String args[]) throws FileNotFoundException{
	Student s=new Student();
	s.setRollNO(100);
	s.setFirstName("john");
	s.setLastName("robert");

		Student s1=new Student();
		s1.setRollNO(1001);
		s1.setFirstName("john1");
		s1.setLastName("robert1");
		
	List<Student> ss=new ArrayList<Student>();
	ss.add(s);
	ss.add(s1);
	
	College col=new College();
	col.setStudent(ss);
	
	try {
		XMLEncoder xml= new XMLEncoder(new BufferedOutputStream(new FileOutputStream("G:\\myfile.xml")));
		xml.writeObject(col);
		System.out.println("DONE.........");
		xml.close();
	
		XMLDecoder dxml=new XMLDecoder(new BufferedInputStream(new FileInputStream("G:\\myfile.xml")));
		College c=(College) dxml.readObject();
		
		List<Student> sortq=c.getStudent();
		for(Student sss:sortq){
		System.out.println(sss);
		}
		System.out.println("done.............");
		dxml.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
