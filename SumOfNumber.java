package mock;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            if (number < 1) {
                System.out.println("Please enter a positive number.");
            } else {
                while (number > 0) {
                    sum += number;
                    number--;
                }
                System.out.println("The sum of numbers is: " + sum);
            }
        }
    }
}


