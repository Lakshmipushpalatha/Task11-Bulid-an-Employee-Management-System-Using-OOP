import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(int id){
      this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("--------------------------");
    }
}

public class Task11 {

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = Integer.parseInt(sc.nextLine());

        if (findEmployee(id) != null) {
            System.out.println("Employee ID already exists!");
            return;
        }

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        Employee emp = new Employee(id, name, salary, department);

        employees.add(emp);

        System.out.println("Employee added successfully!");
    }

    public static Employee findEmployee(int id) {

        for (Employee emp : employees) {

            if (emp.getId() == id) {
                return emp;
            }
        }

        return null;
    }

    public static void searchEmployee() {

        System.out.print("Enter Employee ID to search: ");
        int id = Integer.parseInt(sc.nextLine());

        Employee emp = findEmployee(id);

        if (emp != null) {
            System.out.println("Employee Found!");
            emp.displayDetails();
        } else {
            System.out.println("Employee not found!");
        }
    }

    public static void updateEmployee() {

        System.out.print("Enter Employee ID to update: ");
        int id = Integer.parseInt(sc.nextLine());

        Employee emp = findEmployee(id);

        if (emp != null) {

            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            System.out.print("Enter New Department: ");
            String department = sc.nextLine();

            emp.setName(name);
            emp.setSalary(salary);
            emp.setDepartment(department);

            System.out.println("Employee updated successfully!");

        } else {
            System.out.println("Employee not found!");
        }
    }

    public static void displayEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        System.out.println("\n----- Employee List -----");

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    searchEmployee();
                    break;

                case 3:
                    updateEmployee();
                    break;

                case 4:
                    displayEmployees();
                    break;

                case 5:
                    System.out.println("Exiting Employee Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}