package labs_task.lab5;

import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    String course;
    double marks;

    Student(int studentId, String studentName, String course, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);
    }

    void isPassed() {
        if (marks >= 40)
            System.out.println("Result       : Passed");
        else
            System.out.println("Result       : Failed");

        System.out.println();
    }

    // Returns the student having highest marks
    static Student getTopper(Student[] students) {
        Student topper = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }

        return topper;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("------ Student Management System ------");
            System.out.println("How many students do you want to enter details for? ");
            int numStudents = scanner.nextInt();
            scanner.nextLine();
            Student[] students = new Student[numStudents];

            for (int i = 0; i < students.length; i++) {
                
                System.out.println("\nEnter Details of Student " + (i + 1));
                
                System.out.print("Enter Student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter Course: ");
                String course = scanner.nextLine();
                
                System.out.print("Enter Marks: ");
                double marks = scanner.nextDouble();
                scanner.nextLine();
                
                students[i] = new Student(id, name, course, marks);
            }
            
            System.out.println("\n------ Student Details ------");
            
            for (Student student : students) {
                student.displayDetails();
                student.isPassed();
            }
            
            Student topper = Student.getTopper(students);
            
            System.out.println("------ Topper Details ------");
            topper.displayDetails();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid data.");
        }
    }
}