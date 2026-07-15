package labs_task.lab2;

public class LabTask_2 {
    
    public static void main(String[] args) {
        
        // Q1: Sum of all elements of an array
        /*
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += arr[i];
            }
            System.out.println("Sum of all array elements: " + sum);
        }
         */

        
        // Q2: Reverse of String Array
        /*
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            
            String[] fruits = new String[size];
            System.out.println("Enter the strings:");
            for (int i = 0; i < size; i++) {
                fruits[i] = sc.next();
            }
            
            System.out.print("Reversed of String Array: {");
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(fruits[i]);
                if (i != 0)
                    System.out.print(", ");
            }
            System.out.println("}");
        }
         */

        
        // Q3: Largest Element in Array
        /*
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            
            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            
            int largest = arr[0];
            for (int i = 1; i < size; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            System.out.println("The Largest Element from given array is: " + largest);
        }
         */

        
        // Q4: Descending Sort of Array
        /*
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            
            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Compare each element with the rest of the elements and swap if the
            // current element is smaller than the next element using brute force approach
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
         */
    }
}
