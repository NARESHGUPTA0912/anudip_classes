package Looping_Statements;
public class Program3 {

    public static void main(String[] args) {

        int i = 1;
        for (startAttendance(); i <= 10; i++) {
            System.out.println("Roll number: " + i);
        }
    }

    static void startAttendance() {
        System.out.println("Attendance started");
    }
}
