
public class CreationOfString {
    public static void main(String[] args) {
        String s1 = "Naresh Gupta";
        // String s2 = new String(s1);
        String s2 = new String("Naresh Gupta");
        char[] s3 = new char[]{'N','a','r','e','s','h',' ','G','u','p','t','a'};
        char[] s4 = s1.toCharArray();
        System.out.println("First way: " + s1);
        System.out.println("Second way: " + s2);
        System.out.print("Third way: ");
        System.out.println(s3);
        System.out.println(s4);
    }
}
