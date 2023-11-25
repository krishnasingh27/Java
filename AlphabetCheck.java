import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a') {
            System.out.println("Apple");
        } else if (ch == 'b') {
            System.out.println("Ball");
        } else if (ch == 'c') {
            System.out.println("Cat");
        } else {
            System.out.println("Invalid Character");
        }
    }
}
