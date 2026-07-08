package mock;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d X %2d = %2d%n", num, i, num * i);
            }
        } 
    }
}
