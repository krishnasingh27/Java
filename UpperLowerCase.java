import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lowercase.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Uppercase.");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
