
//Checking Whether a number is pallindrome or not
import java.util.Scanner;

public class AvgWhile2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == num) {
            System.out.println("The num is a Pallindrome.");
        } else {
            System.out.println("The num is not a Pallindrome.");
        }
    }
}
