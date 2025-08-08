package GuviAssignment4;

import java.util.Scanner;

//Custom exception for invalid age
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//Custom exception for invalid name
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

//Student class
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Parameterized constructor
 public Student(int rollNo, String name, int age, String course)
         throws AgeNotWithinRangeException, NameNotValidException {

     this.rollNo = rollNo;

     // Name validation (only alphabets and spaces allowed)
     if (!name.matches("[a-zA-Z ]+")) {
         throw new NameNotValidException("Name contains numbers or special characters.");
     }
     this.name = name;

     // Age validation
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age is not between 15 and 21.");
     }
     this.age = age;

     this.course = course;
 }

 // Display student details
 public void display() {
     System.out.println("Roll No: " + rollNo);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
 }
}

//Main class
public class StudentPro {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter Roll No: ");
         int rollNo = sc.nextInt();
         sc.nextLine(); // consume newline

         System.out.print("Enter Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Age: ");
         int age = sc.nextInt();
         sc.nextLine();

         System.out.print("Enter Course: ");
         String course = sc.nextLine();

         // Create Student object
         Student s = new Student(rollNo, name, age, course);

         System.out.println("\nStudent Details:");
         s.display();

     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     sc.close();
 }
}
