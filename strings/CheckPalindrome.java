public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "racecar";
        String rev = reverseString(str);
        if (str.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }

    public static String reverseString(String str) {
        String rev = "";
        for(char c : str.toCharArray()) {
            rev = c + rev;
        }
        return rev;
    }
}