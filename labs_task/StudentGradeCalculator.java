import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks.");
            } else if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }
    }
}
