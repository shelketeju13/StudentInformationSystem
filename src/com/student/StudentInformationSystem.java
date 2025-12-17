package com.student;

import java.util.Scanner;

public class StudentInformationSystem {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n===== STUDENT INFORMATION SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc, manager);
                    break;
                case 2:
                    manager.viewStudents();
                    break;
                case 3:
                    searchStudent(sc, manager);
                    break;
                case 4:
                    updateStudent(sc, manager);
                    break;
                case 5:
                    deleteStudent(sc, manager);
                    break;
                case 0:
                    System.out.println("Application closed.");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 0);

        sc.close();
    }

    static void addStudent(Scanner sc, StudentManager manager) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        if (!ValidationUtils.isValidAge(age)) {
            System.out.println("Invalid age!");
            return;
        }

        System.out.print("Enter Grade (A-F): ");
        char grade = sc.next().toUpperCase().charAt(0);
        if (!ValidationUtils.isValidGrade(grade)) {
            System.out.println("Invalid grade!");
            return;
        }

        sc.nextLine();
        System.out.print("Enter Contact: ");
        String contact = sc.nextLine();

        manager.addStudent(new Student(id, name, age, grade, contact));
        System.out.println("Student added successfully.");
    }

    static void searchStudent(Scanner sc, StudentManager manager) {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        Student s = manager.searchById(id);
        if (s != null) {
            s.display();
        } else {
            System.out.println("Student not found.");
        }
    }

    static void updateStudent(Scanner sc, StudentManager manager) {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.print("New Name: ");
        String name = sc.nextLine();

        System.out.print("New Age: ");
        int age = sc.nextInt();

        System.out.print("New Grade: ");
        char grade = sc.next().toUpperCase().charAt(0);

        sc.nextLine();
        System.out.print("New Contact: ");
        String contact = sc.nextLine();

        if (manager.updateStudent(id, name, age, grade, contact)) {
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }
    
    static void deleteStudent(Scanner sc, StudentManager manager) {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        if (manager.deleteStudent(id)) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }


}
