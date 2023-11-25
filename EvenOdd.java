import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("It is a Even No.");
        } else {
            System.out.println("It is a Odd No.");
        }
    }
}
