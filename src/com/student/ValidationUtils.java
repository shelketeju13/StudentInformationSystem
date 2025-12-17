package com.student;

//Utility class for input validation
public class ValidationUtils {
	
	public static boolean isValidAge(int age) {
      return age > 0;
  }

  public static boolean isValidGrade(char grade) {
      return grade >= 'A' && grade <= 'F';
  }

  public static boolean isValidContact(String contact) {
      return contact.length() >= 10;
  }

}

