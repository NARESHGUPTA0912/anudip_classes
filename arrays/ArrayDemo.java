
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

class ArrayDemo {

    public static void main(String[] args) {

        // Array example
        // int []marks = {10,20,30,40,50};
        // System.out.println(Arrays.toString(marks));
        /**
         * // Declaration of an array double[] marks; // no memory allocated
         * just a reference variable int []nums; float dec[]; boolean [] bool;
         */
        // instantiation of an array
        // double[] markks = new double[5]; // here memory allocated in heap
        // nums = new int[5];
        // int n = 5;
        // int[] a = new int[n];  // allowed
        // initialization of an array using {} Array Initializer
        // double[] markss = {10,20,30,4,0};
        // double []marks = new double[] {10,20,304,540,30};
        // double[] marks;
        //marks = {10,20,30,40};  // it`ll give an error. bcz marks are just an obj. ref
        // double[] marks = new double[5];
        // marks =  {10,20,30,40};  // it`ll also give an error. bcz marks are just an obj. ref
        // double[] marks;
        // marks = new double[]{10,203,04,89,3,003,9};   // this is allowed
        // System.out.println(Arrays.toString(marks));
        /*
        
        // assigning value
        double marks[] = new double[8];
        marks[0] = 56;
        marks[3] = 56;
        marks[4] = 54;
        marks[5] = 34L;
        marks[6] = 4.5F;
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        System.out.println(marks[3]);
        System.out.println(marks[2]);
        System.out.println(marks.length);
        System.out.println(marks[marks.length - 1]);   // last element
        //System.out.println(marks[marks.length]);   // ArrayIndexOutOfBoundsException
        //System.out.println(Arrays.toString(marks) + " " + Arrays.toString(nums) + " " Arrays.toString() + " " + Arrays.toString(bool));

        //int b[] = new int[-7];  // NegativeArraySizeException
        //int[] c = new int[];    // give error: incompatible types: int cannot be converted to int[]
        int c[] = new int[0]; // allowed
        int[] d = new int[2]; // size or index can be in int, short and byte only
        Integer x = 10;
        byte s = 5;
        int[] f = new int[s];
        short g = 4;
        int[] gh = new int[g];
        int[] h = new int[x];
        System.out.println(Arrays.toString(h));
        System.out.println(Arrays.toString(f));
        System.out.println(Arrays.toString(gh));
        char ch = 105;
        int[] cha = new int[ch];
        System.out.println(Arrays.toString(cha));
        System.out.println(ch);

        */

        /* 
        // taking user input
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        // accessing the element
        System.out.print("["+numbers[1] + ", ");
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[3] + ", ");
        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[4] + "]");
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        */

        // we can use typecaste operator in array initializer or in array [] brackets.
        int []a = new int[]{(int)3.5, 4, 343, (int) 22.f};
        float f = 2.0f;
        a[(int)f] = 7;
        System.out.println(a[(int) f]);
    }
}
