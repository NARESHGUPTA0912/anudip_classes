
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo extends RuntimeException{
    public static void main(String[] args) {
        try {
            /*
            try {
            FileReader fr = new FileReader("anbc.txt");
            int[] arr = new int[]{1,2,3};
            int res = 10/0;
            System.out.println(res);
            System.out.println(arr[4]);
            } catch(ArithmeticException | ArrayIndexOutOfBoundsException | FileNotFoundException e) {
            System.out.println(e);     // java.lang.ArithmeticException: / by zero
            System.out.println(e.getMessage());      // / by zero
            // } catch (FileNotFoundException ex) {
            //     System.getLogger(ExceptionDemo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            // }
            // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
            // Index 4 out of bounds for length 3
            // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
            // Index 4 out of bounds for length 3
            } finally {
            System.out.println("Hello Exceptions");
            }
            */
            
            System.out.println("Return Value: " + divide(10, 0));
        } catch (Exception ex) {
            System.getLogger(ExceptionDemo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public static int divide(int a, int b) throws Exception {
        try {
            System.out.println("try block!");
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Catch Block!");
            throw new Exception("Rethrow an exception!");
            // return a+b;
        } finally {
            System.out.println("Finally Block!");
            // return a+b+2;
        }
    }
}