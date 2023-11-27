import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the Year: ");
        int Year = sc.nextInt();

        if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
            System.out.println(Year + " is a Leap Year. ");
        } else {
            System.out.println(Year + " is not a Leap Year. ");
        }
    }
}
