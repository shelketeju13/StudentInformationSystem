package com.student;

import java.util.ArrayList;

//Business logic class
public class StudentManager {

  private ArrayList<Student> students = new ArrayList<>();

  // Add student
  public void addStudent(Student student) {
      students.add(student);
  }

  // View all students
  public void viewStudents() {
      if (students.isEmpty()) {
          System.out.println("No student records available.");
          return;
      }

      System.out.printf("%-8s %-15s %-5s %-6s %-15s%n",
              "ID", "Name", "Age", "Grade", "Contact");

      for (Student s : students) {
          s.display();
      }
  }

  // Search by ID
  public Student searchById(int id) {
      for (Student s : students) {
          if (s.getStudentId() == id) {
              return s;
          }
      }
      return null;
  }

  // Update student
  public boolean updateStudent(int id, String name, int age, char grade, String contact) {
      Student s = searchById(id);
      if (s != null) {
          s.setName(name);
          s.setAge(age);
          s.setGrade(grade);
          s.setContact(contact);
          return true;
      }
      return false;
  }
  
// Delete student
  public boolean deleteStudent(int id) {
      Student s = searchById(id);
      if (s != null) {
          students.remove(s);
          return true;
      }
      return false;
  }

}

