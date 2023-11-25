import java.util.Scanner;

public class VoterId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }
    }
}
