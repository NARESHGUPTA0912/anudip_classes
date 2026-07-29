public class ReverseString {
    public static void main(String[] args) {
        String s = "My Name is Naresh Gupta";
        reverseString(s);
        reverseWordsPosition(s);
        reverseStringWithoutWordsPosition(s);
    }

    public static void reverseWordsPosition(String str) {
        String[] arr = str.split(" ");
        String revPos = "";
        for(String s: arr) {
            revPos = s + " " + revPos;
        }
        System.out.println(revPos);
    }

    public static void reverseString(String str) {
        String rev = "";
        for(char c : str.toCharArray()) {
            rev = c + rev;
        }
        System.out.println("Reverse String is: " + rev);
    }

    public static String reverseString2(String str) {
        String rev = "";
        for(char c : str.toCharArray()) {
            rev = c + rev;
        }
        return rev;
    }

    // two pointer approach 
    public static void reverseWordsPosition2(String str) {
        String[] arr = str.split(" ");
        int left=0, right=arr.length-1;
        while (left<right) {
            String temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;     right--;
        }
        for(String s: arr) {
            System.out.print(s +" ");
        }
    }

    public static void reverseStringWithoutWordsPosition (String s) {
        String[] str = s.split(" ");
        String rev = "";
        for (int i=0; i<str.length; i++) {
            rev += " " + reverseString2(str[i]);
        }
        System.out.println(rev.trim());
    }
}