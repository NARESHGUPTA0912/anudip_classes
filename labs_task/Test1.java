import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        // ----------------------------------------------
        // Q1 -> Calculator Using Operators (+,-,*,/,%)
        // ----------------------------------------------
        /*
        System.out.println("Welcome to the Calculator!");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();
            System.out.print("Enter an operator (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            if (op == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (op == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else if (op == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (op == '/') {
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
            } else if (op == '%') {
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 % num2));
                } else {
                    System.out.println("Cannot perform modulus by zero.");
                }
            } else {
                System.out.println("Please enter a valid operator: +, -, *, /, %");
            }
        }
         */


        // -------------------------------
        // Q2 -> Check Even or Odd
        // -------------------------------
        /*
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int number = sc.nextInt();
            
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
         */


        // -------------------------------------------
        // Q3 -> Check Positive, Negative or Zero
        // -------------------------------------------
        /*
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
         */


        // ------------------------------------
        // Q4 -> Student Grade Calculator
        // ------------------------------------
        /*
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
         */


        // ---------------------------------------------
        // Q5 -> Multiplication Table using for loop
        // ---------------------------------------------
        /*
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d X %2d = %2d%n", num, i, num * i);
            }
        }
         */


        // ------------------------------------------------------
        // Q6 -> Sum of Numbers using while loop from 1 to n
        // ------------------------------------------------------
        /*
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
         */


        // -----------------------------------------------
        // Q7 -> Factorial of a number using for loop
        // -----------------------------------------------
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("The factorial of " + number + " is: " + factorial);
            }
        }
    }
}
