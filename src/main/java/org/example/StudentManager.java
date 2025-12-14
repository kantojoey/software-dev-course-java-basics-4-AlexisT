package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private List<String> students = new ArrayList<>();

    public void mainMenu() {
        System.out.println("Welcome to the student manager!");
        System.out.println("1. Add student");
        System.out.println("2. Remove student");
        System.out.println("3. View all students");
        System.out.println("4. Exit");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            addStudent();
        } else if (choice.equals("2")) {
            removeStudent();
        } else if (choice.equals("3")) {
            viewStudents();
        } else if (choice.equals("4")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public void addStudent() {
        // Prompt the user to enter a new student name (using scanner and I/O methods learned previously,
        // refer to mainMenu() for an example)
        // Add the student to the list
        System.out.println("Please enter the name of the student you would like to add:");
        String newStudent = scanner.nextLine();
        if (!students.contains(newStudent)) {
            students.add(newStudent);
            System.out.println(newStudent + " has been successfully added!");
        } else {
            System.out.println("That student is already enrolled! Come talk to me when you mean business.");
        }
        mainMenu();
    }

    public void removeStudent() {
        // Prompt the user for a student name
        // Use the contains method to check if the student entered is in the list
        // If so, remove it, if not, print "Student not found."
        System.out.println("Please enter the name of the student you would like to remove from the class");
        String removed = scanner.nextLine();
        if (students.contains(removed)) {
            students.remove(removed);
            System.out.println(removed + " was successfully removed from your class. I hope you're happy!");
        } else {
            System.out.println("That student was not found! Try again.");
        }

        mainMenu();
    }

    public void viewStudents() {
        // Loop through the list of students and print each one
        // (Use a for-each loop!)

        if (students.size() > 0) {
            for (String student : students) {
                System.out.println("Here is your STUDENT LIST:");
                System.out.println(student);
                System.out.println("TA-DAAAAAA!!!");
            }
        } else {
            System.out.println("SORRY BUDDY it looks like nobody wants to take your class. Why is that?");
        }
        mainMenu();
    }
}
