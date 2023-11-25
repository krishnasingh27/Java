import java.util.Scanner;

public class FiveNoMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int d = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int e = sc.nextInt();

        if (a > b && a > c && a > d && a > e) {
            System.out.println("a is greater.");
        } else if (b > a && b > c && b > d && b > e) {
            System.out.println("b is greater.");
        } else if (c > a && c > b && c > d && c > e) {
            System.out.println("c is greater.");
        } else if (d > a && d > b && d > c && d > e) {
            System.out.println("d is greater.");
        } else {
            System.out.println("e is greater.");
        }
    }
}
