import java.util.Scanner;

public class OperatorsCalculator {

    public static void main(String[] args) {
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
    }
}
