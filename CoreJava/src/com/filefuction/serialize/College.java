package com.filefuction.serialize;

import java.util.List;

public class College {
	
	private List<Student> student;

	public List<Student> getStudent() {
		return student;
	}

	@Override
	public String toString() {
		return "College [student=" + student + "]";
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	

}
