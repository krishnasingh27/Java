import java.util.Scanner;

public class BasicWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int m = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n = sc.nextInt();

        int i = 100;
        while (i >= 1) {
            if (i % m == 0 && i % n == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
