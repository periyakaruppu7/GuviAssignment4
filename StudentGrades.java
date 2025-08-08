package GuviAssignment4;
import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    private HashMap<String, Integer> grades = new HashMap<>();

    // Method to add a new student
    public void addStudent(String name, int grade) {
        grades.put(name, grade);
        System.out.println("Student added: " + name + " - Grade: " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (grades.remove(name) != null) {
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade
    public void displayGrade(String name) {
        if (grades.containsKey(name)) {
            System.out.println(name + "'s Grade: " + grades.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Grade Manager ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameAdd = sc.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = sc.nextInt();
                    sg.addStudent(nameAdd, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameRemove = sc.nextLine();
                    sg.removeStudent(nameRemove);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameDisplay = sc.nextLine();
                    sg.displayGrade(nameDisplay);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
