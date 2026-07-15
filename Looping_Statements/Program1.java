package Looping_Statements;
// wap to find freq of each digit
public class Program1{
    public static void printFrequency(int n){
        String s = n+"";
        int freq[] = new int[10];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'0']++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 0){
                System.out.println( i + " : " + freq[i] );
            }
        }
    }

    public static void main(String[] args) {
        printFrequency(22534432);
    }
}