
//Perfect Number
import java.util.Scanner;

public class AvgWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int n = 1, sum = 0;
        while (n < num) {
            if (num % n == 0) {
                sum += n;
            }
            n++;
        }
        if (sum == num) {
            System.out.println("It is a Perfect Number.");
        } else {
            System.out.println("It is not a Perfect Number.");
        }
    }
}
