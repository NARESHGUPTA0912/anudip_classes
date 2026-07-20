public class CharArray {
    public static void main(String[] args) {
        char[] arr = new char[]{'n','a','r','e','s','h'};
        System.err.println(arr); // naresh
        String s = arr.toString(); // [C@251a69d7
        System.out.println(s);

        for (int el : arr) { // we can take int, bcz char implicitly typecaste in int
            System.out.println((char)el);
        }
    }
}