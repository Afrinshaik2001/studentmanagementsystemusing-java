package javaproject;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class MainClass {
	    private static StudentManager studentManager = new StudentManager();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int choice;
	        do {
	            showMenu();
	            choice = getInputInt("Enter your choice: ");
	            switch (choice) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    studentManager.displayStudents();
	                    break;
	                case 3:
	                    updateStudent();
	                    break;
	                case 4:
	                    deleteStudent();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);
	    }

	    private static void showMenu() {
	        System.out.println("\n1. Add Student");
	        System.out.println("2. Display Students");
	        System.out.println("3. Update Student");
	        System.out.println("4. Delete Student");
	        System.out.println("5. Exit");
	    }

	    private static void addStudent() {
	        String name = getInputString("Enter name: ");
	        int age = getValidAge();
	        int id = getInputInt("Enter student ID: ");

	        Student newStudent = new Student(name, age, id);
	        studentManager.addStudent(newStudent);
	        System.out.println("Student added successfully.");
	    }

	    private static void updateStudent() {
	        int id = getInputInt("Enter the student ID to update: ");
	        String newName = getInputString("Enter new name: ");
	        int newAge = getValidAge();

	        if (studentManager.updateStudent(id, newName, newAge)) {
	            System.out.println("Student updated successfully.");
	        } else {
	            System.out.println("Student not found.");
	        }
	    }

	    private static void deleteStudent() {
	        int id = getInputInt("Enter the student ID to delete: ");
	        if (studentManager.deleteStudent(id)) {
	            System.out.println("Student deleted successfully.");
	        } else {
	            System.out.println("Student not found.");
	        }
	    }

	    private static int getValidAge() {
	        int age;
	        do {
	            age = getInputInt("Enter age (0-120): ");
	            if (age < 0 || age > 120) {
	                System.out.println("Invalid age. Please enter a value between 0 and 120.");
	            }
	        } while (age < 0 || age > 120);
	        return age;
	    }

	    private static int getInputInt(String prompt) {
	        System.out.print(prompt);
	        while (true) {
	            try {
	                return scanner.nextInt();
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input. Please enter a valid number.");
	                scanner.next(); // Clear the invalid input
	            }
	        }
	    }

	    private static String getInputString(String prompt) {
	        System.out.print(prompt);
	        return scanner.next();
	    }
	}



