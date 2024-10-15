package javaproject;

import java.util.ArrayList;
import java.util.List;

	public class StudentManager {
	    private List<Student> students;

	    public StudentManager() {
	        students = new ArrayList<>();
	    }

	    // Add a new student
	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    // Display all students
	    public void displayStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students available.");
	        } else {
	            for (Student student : students) {
	                System.out.println(student);
	            }
	        }
	    }

	    // Update student information by ID
	    public boolean updateStudent(int id, String newName, int newAge) {
	        for (Student student : students) {
	            if (student.getId() == id) {
	                student.setName(newName);
	                student.setAge(newAge);
	                return true;
	            }
	        }
	        return false;
	    }

	    // Delete a student by ID
	    public boolean deleteStudent(int id) {
	        return students.removeIf(student -> student.getId() == id);
	    }
	


}
