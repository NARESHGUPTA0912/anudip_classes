public class GenerateOTP {
    public static void main(String[] args) {
        System.out.println("Fout Digit OTP: " + generate4DigitOTP());
        System.out.println("Six Digit OTP: " + generate6DigitOTP());
    }

    public static int generate4DigitOTP(){
        int min = 1000;
        int max = 9999;
        // System.out.println(min);
        int otp = min + (int) (Math.random() * (max-min));
        return otp;
    }

    public static int generate6DigitOTP(){
        int min = 100000;
        int max = 999999;
        // System.out.println(min);
        int otp = min + (int) (Math.random() * (max-min));
        return otp;
    }
}
