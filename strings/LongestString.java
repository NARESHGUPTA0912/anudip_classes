public class LongestString {
    public static void main(String[] args) {
        String s = "My name is anthony gonsalves .";
        String[] str = s.split(" ");
        String largest = "";
        for(String a: str) {
            if(a.length()>largest.length()) {
                largest = a;
            }
        }
        System.out.println("Longest String: " + largest);
        System.out.println("Its Length is: " + largest.length());
    }
}
