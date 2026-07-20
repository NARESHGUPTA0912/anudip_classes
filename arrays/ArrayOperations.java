
import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {

        // declare + create + initialize
        int[] numbers = {10, 20, 30, 40};
        // check length
        System.out.println(numbers.length);
        // accessing each element
        System.out.println(numbers[0]); // 10
        System.out.println(numbers[1]); // 20
        System.out.println(numbers[2]); // 30
        System.out.println(numbers[3]); // 40

        // modifying / update
        numbers[1] = 50;
        System.out.println(numbers[1]);

        // traversing using for loop 
        for (int i = 0; i < numbers.length; i++) {   // But if you need the index, use a normal for loop.
            System.out.println(numbers[i]);
        }

        // traversing using while loop
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i++]);
        }

        // traversing using for-each loop
        for (int number : numbers) {        // A for-each loop is useful when you only need values.
            System.out.println(number);
        }
        // sort an array
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
