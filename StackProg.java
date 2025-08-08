package GuviAssignment4;

import java.util.Scanner;
import java.util.Stack;

public class StackProg {
    private Stack<Integer> stack = new Stack<>();

    // Push element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + " pushed onto the stack");
    }

    // Pop element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            System.out.println(removed + " popped from the stack");
        } else {
            System.out.println("Stack is empty.Cannot pop.");
        }
    }

    // Check if stack is empty
    public void checkEmpty() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The stack is NOT empty");
        }
    }

    public static void main(String[] args) {
        StackProg intStack = new StackProg();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---Stack Operations---");
            System.out.println("1.Push Element");
            System.out.println("2.Pop Element");
            System.out.println("3.Check if Stack is Empty");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push:");
                    int num = sc.nextInt();
                    intStack.pushElement(num);
                    break;
                case 2:
                    intStack.popElement();
                    break;
                case 3:
                    intStack.checkEmpty();
                    break;
                case 4:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid choice! Try again");
            }
        } while (choice != 4);

        sc.close();
    }
}
