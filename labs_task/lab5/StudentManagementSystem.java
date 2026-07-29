/*** Assignment - 1 ***/
class Student {
    int studentId;
    String studentName;
    String course;
    double marks;

    // Parameterized Constructor
    Student(int studentId, String studentName, String course, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    // Display Student Details
    void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);
    }

    // Check Pass or Fail
    void isPassed() {
        if (marks >= 40) {
            System.out.println("Result       : Passed");
        } else {
            System.out.println("Result       : Failed");
        }
        System.out.println();
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Naresh Gupta", "MCA", 84);
        Student s2 = new Student(102, "Anushka Pal", "MBA", 77);
        Student s3 = new Student(103, "Prince Gupta", "M.Tech", 89);

        s1.displayDetails();
        s1.isPassed();

        s2.displayDetails();
        s2.isPassed();

        s3.displayDetails();
        s3.isPassed();
    }
}