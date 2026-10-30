# Task11-Bulid-an-Employee-Management-System-Using-OOP
java calculation

Task 11: Employee Management System Using OOP

1. Introduction

The Employee Management System is a menu-driven Java application developed using Object-Oriented Programming (OOP) concepts.

This program allows users to add, search, update, and display employee details.

Each employee has four details:

- Employee ID
- Employee Name
- Salary
- Department

2. Objective

The objective of this program is to understand how classes, objects, constructors, encapsulation, methods, and ArrayList are used to develop a real-world employee management application.

3. Concepts Used

- Classes and Objects
- Constructors
- Encapsulation
- Private Variables
- Getter and Setter Methods
- ArrayList
- Scanner Class
- Methods
- Switch Statement
- Do-While Loop

4. Step-by-Step Program Explanation

Step 1: Import Required Packages

import java.util.ArrayList;
import java.util.Scanner;

- "ArrayList" is used to store multiple employee objects.
- "Scanner" is used to accept input from the user.

Step 2: Create Employee Class

class Employee {

The Employee class acts as a blueprint for creating employee objects.

Step 3: Declare Private Variables

private int id;
private String name;
private double salary;
private String department;

These variables store employee information.

The "private" keyword protects the variables from direct access outside the Employee class. This implements encapsulation.

Step 4: Create Constructor

public Employee(int id, String name,
                double salary, String department) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.department = department;
}

The constructor initializes employee details when an object is created.

The "this" keyword refers to the current object's variables.

For example:

"this.id = id;"

The left-side "id" refers to the instance variable, and the right-side "id" refers to the constructor parameter.

Step 5: Create Getter Methods for all the variables like this.

public int getId() {
    return id;
}

Step 6: Create Setter Methods for all the variables like this.
 
public void setId(int id) {
    this.id = id;
}

Step 7: Create Display Method

public void displayDetails() {
    System.out.println("Employee ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Salary: " + salary);
    System.out.println("Department: " + department);
}

This method displays all the details of an employee.

Step 8: Create Main Management Class

public class Task11 {

This class contains the main method and all employee management operations.

Step 9: Create ArrayList and Scanner

static ArrayList<Employee> employees = new ArrayList<>();
static Scanner sc = new Scanner(System.in);

- "ArrayList<Employee>" stores multiple Employee objects.
- "employees" is the name of the ArrayList.
- "new ArrayList<>()" creates an empty list.
- "Scanner" accepts input from the user.
- "static" allows these members to be accessed directly by the static methods of this class.

Step 10: Implement Add Employee Method

public static void addEmployee()

This method adds a new employee.

Execution:

1. Accept the employee ID.
2. Check whether the ID already exists using "findEmployee(id)".
3. If the ID exists, display a duplicate ID message.
4. Otherwise, accept the employee name, salary, and department.
5. Create an Employee object using the constructor.
6. Add the object to the ArrayList using "employees.add(emp)".

Step 11: Implement Find Employee Method

public static Employee findEmployee(int id) {
    for (Employee emp : employees) {
        if (emp.getId() == id) {
            return emp;
        }
    }
    return null;
}

This method searches for an employee using their ID.

Execution:

1. The enhanced for loop checks each employee in the ArrayList.
2. "emp.getId()" retrieves the employee ID.
3. The "if" condition compares it with the given ID.
4. If the ID matches, the employee object is returned.
5. If no matching employee is found, "null" is returned.

Step 12: Implement Search Employee Method

public static void searchEmployee()

This method searches and displays employee information.

Execution:

1. Accept the employee ID from the user.
2. Call "findEmployee(id)" to search.
3. If the returned employee is not null, display the details.
4. Otherwise, display "Employee not found!"

Step 13: Implement Update Employee Method

public static void updateEmployee()

This method updates an existing employee's information.

Execution:

1. Accept the employee ID.
2. Search for the employee using "findEmployee(id)".
3. Check whether the employee exists.
4. Accept the new name, salary, and department.
5. Call setter methods to update the information.
6. Display a success message.

Step 14: Implement Display Employees Method

public static void displayEmployees()

This method displays all employee records.

Execution:

1. Check whether the ArrayList is empty using "employees.isEmpty()".
2. If it is empty, display "No employees available."
3. Otherwise, use an enhanced for loop.
4. Call "displayDetails()" for each employee.

Step 15: Implement Main Method

public static void main(String[] args)

The main method is the starting point of the Java application.

int choice;

do {
    // Display menu
} while (choice != 5);

The do-while loop displays the menu at least once and repeats it until the user selects option 5.

Step 16: Implement Switch Statement for above methods 

The switch statement performs different operations based on the user's choice.

- Case 1: Add employee.
- Case 2: Search employee.
- Case 3: Update employee.
- Case 4: Display employees.
- Case 5: Exit the program.
- Default: Handles invalid choices.

5. Program Execution Flow

1. The program starts from the main method.
2. The menu is displayed.
3. The user selects an operation.
4. The corresponding method is called.
5. The selected operation is performed.
6. The menu is displayed again.
7. The program terminates when the user selects Exit.

6. Sample Output

===== EMPLOYEE MANAGEMENT SYSTEM =====

1. Add Employee
2. Search Employee
3. Update Employee
4. Display All Employees
5. Exit

Enter your choice: 1

Enter Employee ID: 101
Enter Employee Name: Ravi
Enter Salary: 25000
Enter Department: IT

Employee added successfully!

7. Learning Outcomes

After completing this program, I learned:

- How to create and use classes and objects.
- How constructors initialize object data.
- How encapsulation protects employee information.
- How getter and setter methods access and update data.
- How ArrayList stores multiple objects.
- How to search for an object using a loop.
- How to implement different operations using methods.
- How switch statements and do-while loops work in menu-driven applications.

8. Conclusion

This Employee Management System helped me understand the practical implementation of Object-Oriented Programming concepts in Java.

I gained hands-on experience in creating classes, objects, constructors, encapsulation, getter and setter methods, and managing multiple objects using ArrayList.
