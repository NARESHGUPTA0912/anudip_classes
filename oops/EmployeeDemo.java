
import java.util.Scanner;

class Employee {

    int empId;
    double baseSalary;
    String empName;

    public Employee(int empId, double baseSalary, String empName) {
        this.empId = empId;
        this.baseSalary = baseSalary;
        this.empName = empName;
    }

    public void calSalary() {
        System.out.println("Employee Salary: " + baseSalary);
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class Manager extends Employee {

    double finalSalary;
    
    public Manager(int empId, double baseSalary, String empName) {
        super(empId, baseSalary, empName);
    }

    @Override
    public void calSalary() {
        double bonus = 20; // 20% bonus
        finalSalary = baseSalary + (baseSalary * (bonus/100));
        System.out.println("Calculating Salary of Manager with Bonus: " + finalSalary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Role: Manager");
        System.out.println("Final Salary: " + finalSalary);
    }
}

class Developer extends Employee {

    public Developer(int empId, double baseSalary, String empName) {
        super(empId, baseSalary, empName);
    }

    @Override
    public void calSalary() {
        double projectAllowance = 8000;
        double finalSalary = baseSalary + projectAllowance;
        System.out.println("Calculating Salary of Developer with Bonus: " + finalSalary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // // parent class
        // Employee emp = new Employee();
        // emp.calSalary();

        // // child class
        // Manager mgr = new Manager();
        // mgr.calSalary();

        // // execute child class method using parent class reference
        // // implementation change at runtime
        // Employee emp1 = new Manager();
        // emp1.calSalary();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Employee Name: ");
            String empName = sc.nextLine();
            System.out.println("Enter Employee ID: ");
            int empId = sc.nextInt();
            System.out.println("Enter Employee Base Salary: ");
            double baseSalary = sc.nextDouble();

            System.out.println("Enter Employee Type (Manager/Developer): ");
            String empType = sc.next();

            Employee emp;
            if(empType.equalsIgnoreCase("Manager")) {
                emp = new Manager(empId, baseSalary, empName);
            } else if(empType.equalsIgnoreCase("Developer")) {
                emp = new Developer(empId, baseSalary, empName);
            } else {
                System.out.println("Invalid Employee Type");
                return;
            }
            emp.calSalary();
        }
    }
}
