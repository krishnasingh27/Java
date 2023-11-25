import java.util.Scanner;

public class DivByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println(num + " is divided by 5. ");
        } else {
            System.out.println(num + "is not divided by 5. ");
        }
    }
}
