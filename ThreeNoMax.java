import java.util.Scanner;

public class ThreeNoMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is greater.");
        } else if (b > a && b > c) {
            System.out.println("b is greater.");
        } else {
            System.out.println("c is greater.");
        }
    }
}
