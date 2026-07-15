public class Task {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
        System.out.println(isPalindrome(1771));
    }

     //  reverse number
    public static int reverseNumber(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }

    // leetcode problem 9 check palindrome number
    public static boolean isPalindrome(int n){
        int temp=n, rev=0;
        while(temp>0){
            rev=rev*10+(temp%10);
            temp/=10;
        }
        return n==rev;
    }
}
