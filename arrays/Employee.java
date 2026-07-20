import java.util.Arrays;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        System.out.println(employees);  // [LEmployee;@251a69d7 (Array Like of Employee type )
        // [ means array, L means like it array of object references, Employee type; rest is address in hashcode.
        System.out.println(Arrays.toString(employees));
        employees[0] = new Employee(1,"Naresh");
        employees[1] = new Employee(2, "Paresh");
        System.out.println(employees[0]);  // Employee@7344699f
        System.out.println(employees[0].id);
        System.out.println(employees[0].name);

        Employee[] emps2 = {new Employee(1,"Anushka"), new Employee(2, "Naresh"), 
                            new Employee(3,"Sonali"), new Employee(4, "Prince")};

        for(Employee e: emps2) {
            System.out.println("Employee Id: " + e.id + " Employee Name: " + e.name);
        }
    }
}
