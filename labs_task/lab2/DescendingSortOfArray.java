package labs_task.lab2;

import java.util.Scanner;

public class DescendingSortOfArray {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            
            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            
            /* Compare each element with the rest of the elements and swap 
            if the current element is smaller than the next element using brute force approach */
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            
            System.out.print("Array in Descending Order: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
