import java.util.Scanner;

public class NegatvePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println(num + " is Zero.");
        }
    }
}
