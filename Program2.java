public class Program2{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            System.out.println(i);
            System.out.println(showProgress()+i);
        }
    }

    static String showProgress(){
        return "Completed step: ";
    }
}