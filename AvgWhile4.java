
//Checking Whether a number is Neon or not
import java.util.Scanner;

public class AvgWhile4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int sum = 0, sqr = num * num;
        while (sqr > 0) {
            int rem = sqr % 10;
            sum += rem;
            sqr /= 10;
        }
        if (sum == num) {
            System.out.println("It is a neon number.");
        } else {
            System.out.println("It is not a neon number.");
        }
    }
}
