import java.util.Scanner;

public class MToCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Height in Meters: ");
        double h = sc.nextDouble();
        double cm = h * 100;
        System.out.println(cm + " cm is your hight.");

        if (cm > 180) {
            System.out.println("High");
        } else if (cm >= 150 && cm <= 180) {
            System.out.println("Medium");
        } else {
            System.out.println("Low");
        }
    }
}
