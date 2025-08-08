package GuviAssignment4;

import java.util.Scanner;

public class DaysPro {
    public static void main(String[] args) {
        // Store weekdays in an array
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter day index (0-6): ");
        int index = sc.nextInt();
        
        try {
            // Print the corresponding day
            System.out.println("Day is: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle if index is out of range
            System.out.println("Invalid index! Please enter a number between 0 and 6.");
        }
        
        sc.close();
    }
}
