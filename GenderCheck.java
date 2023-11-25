import java.util.Scanner;

public class GenderCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        char ch = sc.next().charAt(0);

        if (ch == 'm') {
            System.out.println("Male");
        } else if (ch == 'f') {
            System.out.println("Female");
        } else {
            System.out.println("Invalid Gender");
        }
    }
}
