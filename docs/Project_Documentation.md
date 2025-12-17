# Student Information System

## 1. Project Overview

The Student Information System is a console-based Java application developed as part of an internship training program. The main goal of this project is to understand Java programming fundamentals, object-oriented concepts, and basic data handling using collections. The system allows users to manage student records efficiently through a menu-driven interface.

---

## 2. Project Objectives

* To understand Java syntax and programming fundamentals
* To apply Object-Oriented Programming concepts such as classes, objects, encapsulation, and methods
* To implement user input handling using the Scanner class
* To perform CRUD operations (Create, View, Update, Delete)
* To implement basic input validation and error handling
* To store and manage data using ArrayList

---

## 3. Technologies Used

* Java (JDK 8)
* Scanner class for user input
* ArrayList for data storage
* Spring Tool Suite 
* GitHub for version control

---

## 4. System Requirements

* Operating System: Windows
* Java Development Kit (JDK) 8 
* IDE: Spring Tool Suite (STS) 

---

## 5. Setup and Installation Instructions

1. Download and install JDK 8 
2. Install Spring Tool Suite (STS) 
3. Clone or download the project from GitHub repository
4. Open STS
5. Import the project as a Java Project
6. Navigate to `StudentInformationSystem.java`
7. Right-click and select **Run As → Java Application**

---

## 6. Project Structure

```
Student-Information-System/
│
├── README.md
├── src/
│   └── com/student/
│       ├── Student.java
│       ├── StudentManager.java
│       ├── StudentInformationSystem.java
│       └── ValidationUtils.java
├── docs/
│   └── Project_Documentation.md
├── test_data/
│   └── sample_student.txt
```

---

## 7. Code Structure Explanation

### Student.java

* Represents the Student entity
* Contains attributes: studentId, name, age, grade, contact
* Includes getters, setters, constructor, and display method

### StudentManager.java

* Handles business logic
* Manages ArrayList of students
* Provides methods to add, view, search, update, and delete students

### StudentInformationSystem.java

* Main class
* Provides menu-driven interface
* Handles user input and calls StudentManager methods

### ValidationUtils.java

* Contains static methods for input validation
* Validates age and grade values

---

## 8. User Manual (How to Use the Application)

### Main Menu Options

1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit

### Add Student

* Enter student ID
* Enter student name
* Enter age (must be positive)
* Enter grade (A to F)
* Enter contact information

### View Students

* Displays all stored student records in tabular format

### Search Student

* Search a student using student ID

### Update Student

* Update name, age, grade, and contact using student ID

### Delete Student

* Delete a student record using student ID

---

## 9. Data Validation

* Age must be a positive number
* Grade must be between A and F
* Error messages are shown for invalid inputs

---

## 10. Technical Details

* Implements Object-Oriented Programming (OOP) concepts such as classes, objects, encapsulation, and methods
* Creates and uses objects (e.g., `Student` objects) to represent real-world student entities
* Demonstrates object interaction where `StudentInformationSystem` creates objects and delegates operations to `StudentManager`
* Uses `ArrayList<Student>` for in-memory data storage
* Uses loops and conditional statements for searching, updating, and deleting records
* Follows modular design with separation of concerns:

  * Model layer (Student class)
  * Business logic layer (StudentManager class)
  * Presentation layer (StudentInformationSystem class)

---

## 11. Explanation of How Technical Requirements Are Met

 Requirement                   |                       Implementation 
--------------------------------------------------------------------------------------
 Student class with attributes     | Implemented in `Student.java` with proper encapsulation
  
 Menu-driven interface             | Implemented in `StudentInformationSystem.java` using Scanner 
 
 Add/View/Update/Delete            | Implemented in `StudentManager.java` 
 
 Search functionality              | Search by student ID using loops 
 
 Data validation                   | Implemented in `ValidationUtils.java` 
 
 Data persistence                  | Managed using ArrayList 

---

## 12. Testing Evidence

### Sample Test Cases

Test Case | Input | Expected Output 
-------------------------------------------------------------------
 Add Student | Valid details | Student added successfully |
 
 Invalid Age | -5 | Invalid age message | 
 
 Search Student	|  Existing ID	   |  Student details displayed
 
 Delete Student |   Valid ID  |  Student deleted successfully 

---

## 13. Conclusion

This project helped in understanding Java basics, object-oriented programming, and simple data management. The Student Information System successfully meets all the technical requirements defined for the internship task.

---

## 14. Author

**Name:** Tejaswini Shelke
