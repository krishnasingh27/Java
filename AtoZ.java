import java.util.Scanner;

public class AtoZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is b/w a to z.");
        } else {
            System.out.println(ch + " is not b/w a to z.");
        }
    }
}
