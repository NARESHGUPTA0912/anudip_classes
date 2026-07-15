package Looping_Statements;
public class Program2{
    public static void main(String[] args) {
        // for(int i=1; i<=5; i++) {
        //     System.out.println(i);
        //     System.out.println(showProgress()+i);
        // }

        for(int i=1; i<=5; showProgress(i), i++) {
            System.out.println(i);
        }
    }

    static void showProgress(int i){
        System.out.println("Completed step: " + i);
    }
}