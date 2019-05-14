package com.bridgelabz.builtinannotation;
/*
 * Created by:Shweta Kale.
 * Purpose:Annotation demo.
 * Description:use built-in annotations. 
 * 
 */


public class AnnotationDemo {

	public static void main(String[] args) {
		System.out.println("***************teachers details*************");
		Teacher object=new Teacher(101,"shweta","DotNet");
		object.teacherDetails();
		System.out.println("***************student's details************");
		object.setStudentId(1);
		object.setStudentName("priya");
		object.setStudentAddress("pune");
		object.studentDetails();

	}

}
