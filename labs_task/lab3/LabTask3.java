/**
 * Lab Task 3
 *  1. print only the primary diagonal : 10 50 90
 *  2. print only the secondary diagonal : 30 50 70
 *  3. Count how many even and odd numbers are present in a 2D array.
 *  4. Find and display the sum of every row and every column separately.
 */

package labs_task.lab3;

public class LabTask3 {
    public static void main(String[] args) {

        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // 1. Primary diagonal (Solution-1)
        System.out.print("Primary Diagonal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();

        // 2. Secondary diagonal (Solution-2)
        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length - 1 - i] + " ");
        }
        System.out.println();

        // 3. Count even and odd numbers (Solution-3)
        int even = 0, odd = 0;
        for (int[] arr1 : arr) {
            for (int num : arr1) {
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);


        // 4. Sum of each row and each column (Solution-4)
        System.out.println("Sum of each row and each column:");

        // for each row
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " Sum = " + sum);
        }
        
        // for each column
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Column " + (j + 1) + " Sum = " + sum);
        }
    }
}
