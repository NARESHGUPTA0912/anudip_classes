import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        
        // split
        String s = "My name is Natresh";
        String[] str = s.split("is");
        System.out.println(Arrays.toString(str));
    }
}