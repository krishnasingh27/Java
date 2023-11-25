import java.util.Scanner;

public class OneNoMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        if (num > 10) {
            System.out.println("The num is greater then 10.");
        } else {
            System.out.println("The num is smaller then 10.");
        }
    }
}
