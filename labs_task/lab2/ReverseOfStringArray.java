package labs_task.lab2;

import java.util.Scanner;

public class ReverseOfStringArray {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            
            String[] fruits = new String[size];
            System.out.println("Enter the strings:");
            for (int i = 0; i < size; i++) {
                fruits[i] = sc.next();
            }
            
            System.out.print("Reversed Array: {");
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(fruits[i]);
                if (i != 0)
                    System.out.print(", ");
            }
            System.out.println("}");
        }
    }
}