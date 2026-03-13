package com.suraj.javapractice.student;


import com.suraj.javapractice.student.Students;

public class Students {
	int studId;
	String studNmae;
	int studMobileNo;
	
	Students(int studId,String studNmae,int studMobileNo)
	{
		this.studId= studId;
		this.studNmae=studNmae;
		this.studMobileNo=	studMobileNo;
		System.out.println(studId  +"  " + studNmae + "  " + studMobileNo);
	
	}
	public static void main (String []args) 
	{
		Students std1 = new Students(101,"Komal",1011233456); 
		Students std2 = new Students(102,"Suraj",1264532253); 
		Students std3 = new Students(103,"Teju",1378490478); 
		Students std4 = new Students(104,"Swati",1011233456); 
		Students std5 = new Students(105,"Gita",1011233456); 
	}
	

}
