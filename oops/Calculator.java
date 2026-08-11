import java.util.Scanner;

public class Calculator {
    
    public int add(int a, int b) {
        return a+b;
    }
    
    public double add(double a, double b) {
        return a+b;
    }
    
    public int add(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("add two numbers in int: " + cal.add(a, b));
            System.out.println("add two numbers in double: " + cal.add((double)a,(double)b));
            System.out.println("add three numbers in int: " + cal.add(a, b, c));
        }
    }
}