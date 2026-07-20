import java.util.Arrays;

public class ArrayGlobalDemo {

    // static double[] marks; // global array declaration
    int[] nums; // instance array declaration
    public static void main(String[] args) {

        /* Static array initialization and usage
        System.out.println("Marks array before initialization: " + marks); // null (coming from Object toString())
        marks = new double[5]; // global array initialization
        System.out.println("Marks array after initialization: " + marks); // [D@15 ([ means array, D means Double type of array, rest is hexNo)
        System.out.println("Marks array length: " + marks.length); // 5
        System.out.println(Arrays.toString(marks)); // [0.0, 0.0, 0.0, 0.0, 0.0]

        for(int i = 0; i < marks.length; i++) {
            marks[i] = (i + 1) * 10; // assigning values to the array
        }
        System.out.println("Marks array after assigning values: " + Arrays.toString(marks));
        */

        ArrayGlobalDemo obj = new ArrayGlobalDemo();
        System.out.println("Nums array before initialization: " + obj.nums); // null
        obj.nums = new int[3]; // instance array initialization
        System.out.println("Nums array after initialization: " + obj.nums); // [I@15
        System.out.println("Nums array length: " + obj.nums.length); // 3
        System.out.println(Arrays.toString(obj.nums)); // [0, 0, 0]

        // int address start with [I
        // double 

    }
}
