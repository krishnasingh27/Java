import java.util.Scanner;

public class DivByThreeANDSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println(num + " is divisible by multiple of 3 & 7. ");
        } else {
            System.out.println(num + " is not divisible by multiple of 3 & 7. ");
        }
    }
}
