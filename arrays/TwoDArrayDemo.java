import java.util.Arrays;

public class TwoDArrayDemo {
    static int arr[][];     // second way
    public static void main(String[] args) {
        System.out.println(arr); // null
        int[][] nums = new int[3][];    // first way
        System.out.println(nums);    // [[I@251a69d7
        nums[0] = new int[3];
        System.out.println(nums[0][0]);
        nums[1] = new int[3];
        nums[2] = new int[3];
        System.out.println(Arrays.toString(nums)); // [[I@7344699f, [I@6b95977, [I@7e9e5f8a]

        int[][] sequence = new int[][]{{1,2,3},{4,5,6},{7,8,9}};   // third way

        String[][] seq2 = {{"a","b","c"}, {"d","e","f"},{"g","h","i"}};  // fourth way

        int[][] dec;        // fifth way
        dec = new int[][]{{1,2},{2,3,4,3},{4,3,2}};

        // int[][] abc = new int[2][];
        // abc[0] = {2,3,4}; // error

        int[][] abc = new int[2][3];
        // abc[0] = {4,2,1};   // error
        abc[0] = new int[]{1,2,3};
        abc[1] = new int[]{5,4,2,2};
        System.out.println(Arrays.toString(abc[1]));
        
    }
}
