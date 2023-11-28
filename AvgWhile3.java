
// Checking whether a number is armstrong or not
import java.util.Scanner;

public class AvgWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int count = 0, t = num;
        while (t > 0) {
            t = t / 10;
            count++;
        }
        int temp = num, sum = 0;
        while (temp > 0) {
            int mul = 1;
            int rem = temp % 10;
            for (int i = 1; i <= count; i++) {
                mul *= rem;
            }
            sum += mul;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("It is a armstrong number.");
        } else {
            System.out.println("It is not a armstrong number.");
        }
    }
}
