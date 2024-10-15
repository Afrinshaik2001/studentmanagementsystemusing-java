# Student Management System

A simple console-based student management system built using **Java**. This application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records. The system ensures input validation, specifically for age, ensuring that the age falls within a reasonable range (0 to 120).

## Features

- **Add New Students**: Register students with a name, age, and unique ID.
- **Display Students**: View a list of all registered students.
- **Update Student Information**: Modify existing student details by ID.
- **Delete Students**: Remove student records by ID.
- **Input Validation**: Ensures age is within 0-120 and handles invalid inputs gracefully.
- ![Uploading eclipse-workspace - JavaProject_src_javaproject_MainClass.java - Eclipse IDE 10_16_2024 12_22_04 AM.png…]()
- ![Uploading eclipse-workspace - JavaProject_src_javaproject_MainClass.java - Eclipse IDE 10_16_2024 12_33_29 AM.png…]()



## Installation

### Prerequisites
- **Java Development Kit (JDK)**: [Download and install JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- IDE: You can use any Java-supported IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/downloads/).

### Steps

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/StudentManagementSystem.git
    ```

2. Open the project in your preferred Java IDE or editor.

3. Compile the code and run the `Main.java` class to start the application.
## How to Use

Upon running the program, you will be presented with a menu of options:

```
1. Add Student
2. Display Students
3. Update Student
4. Delete Student
5. Exit
```

### 1. Add Student
- Enter the student's name, age, and a unique ID.
- The system will validate the age (must be between 0 and 120).

### 2. Display Students
- View a list of all students currently added.

### 3. Update Student
- Modify the name and age of an existing student using their unique ID.

### 4. Delete Student
- Remove a student from the system using their unique ID.

### 5. Exit
- Exit the program.

## Code Overview

### `Student.java`
- Represents a student entity with attributes for `name`, `age`, and `id`.
- Contains getter and setter methods for each attribute.

### `StudentManager.java`
- Manages a list of `Student` objects.
- Provides methods to add, display, update, and delete students.

### `Main.java`
- Implements the user interface with a menu-driven approach.
- Takes input from the user and performs actions using `StudentManager`.

## Future Enhancements

- Implement file storage to save and retrieve student data between program executions.
- Add search functionality to find students by name or ID.
- Implement a graphical user interface (GUI) using JavaFX or Swing.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
