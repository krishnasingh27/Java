import java.util.Scanner;

public class AlphabetDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is an alphabet.");
        } else {
            System.out.println("You have entered a digit.");
        }
    }
}
