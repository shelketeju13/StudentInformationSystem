package com.student;

//Student class represents student data
public class Student {
	
	private int studentId;
	private String name;
  private int age;
  private char grade;
  private String contact;
  
  //Constructor 
	public Student(int studentId, String name, int age, char grade, String contact) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.contact = contact;
	}

	// Getters & Setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	//Display Method
	public void display() {
	    System.out.printf("%-8d %-15s %-5d %-6c %-15s%n",
	            studentId, name, age, grade, contact);
	}

	   
}

