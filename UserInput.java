import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Character input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Boolean input
        System.out.print("Enter a boolean (true/false): ");
        boolean b = sc.nextBoolean();

        // Byte input
        System.out.print("Enter a byte: ");
        byte c = sc.nextByte();

        // Short input
        System.out.print("Enter a short: ");
        short d = sc.nextShort();

        // Integer input
        System.out.print("Enter an integer: ");
        int e = sc.nextInt();

        // Long input
        System.out.print("Enter a long: ");
        long f = sc.nextLong();

        // Float input
        System.out.print("Enter a float: ");
        float g = sc.nextFloat();

        // Double input
        System.out.print("Enter a double: ");
        double h = sc.nextDouble();

        System.out.println("Character: " + ch);
        System.out.println("Boolean: " + b);
        System.out.println("Byte: " + c);
        System.out.println("Short: " + d);
        System.out.println("Integer: " + e);
        System.out.println("Long: " + f);
        System.out.println("Float: " + g);
        System.out.println("Double: " + h);

    }
}
