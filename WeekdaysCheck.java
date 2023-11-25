import java.util.Scanner;

public class WeekdaysCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Day " + num + " is Monday");
        } else if (num == 2) {
            System.out.println("Day " + num + " is Tuesday");
        } else if (num == 3) {
            System.out.println("Day " + num + " is Wednesday");
        } else if (num == 4) {
            System.out.println("Day " + num + " is Thursday");
        } else if (num == 5) {
            System.out.println("Day " + num + " is Friday");
        } else if (num == 6) {
            System.out.println("Day " + num + " is Saturday");
        } else if (num == 7) {
            System.out.println("Day " + num + " is Sunday");
        } else {
            System.out.println("Invalid Number.");
        }
    }
}
