
//Printing the reverse of a number
import java.util.Scanner;

public class AvgWhile1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
