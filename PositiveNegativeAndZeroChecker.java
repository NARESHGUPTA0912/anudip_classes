package mock;

import java.util.Scanner;

public class PositiveNegativeAndZeroChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num > 0) {
                System.out.println("Number is Positive.");
            } else if (num < 0) {
                System.out.println("Number is Negative.");
            } else {
                System.out.println("Number is Zero.");
            }
        }
    }
}
