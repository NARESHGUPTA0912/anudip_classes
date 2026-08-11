class Student {
    int studentId;
    String studentName;
    int marks;

    // Constructor
    Student(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Display Report Card
    void displayReportCard() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else {
            System.out.println("Marks        : " + marks);

            if (marks >= 40) {
                System.out.println("Result       : Passed");
            } else {
                System.out.println("Result       : Failed");
            }
        }

        System.out.println("---------------------------");
    }
}

public class StudentReportCard {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Naresh", 85);
        Student s2 = new Student(102, "Rahul", 28);
        Student s3 = new Student(103, "Priya", 110);

        s1.displayReportCard();
        s2.displayReportCard();
        s3.displayReportCard();
    }
}