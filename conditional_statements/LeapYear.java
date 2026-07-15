package conditional_statements;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            checkLeapYearOrNot(year);
        }
    }

    public static void checkLeapYearOrNot(int year){
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Its a leap year.");
        } else {
            System.out.println("Its not a leap year");
        }
    }
}