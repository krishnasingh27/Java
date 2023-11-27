import java.util.Scanner;

public class TemperatureCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature (C for Celsius & F for Fahrenheit): ");
        char a = sc.next().charAt(0);

        if (a == 'F') {
            System.out.print("Enter the temperature in C: ");
            int c = sc.nextInt();
            double f = ((c * 9 / 5) + 32);
            System.out.println(c + " Celcious is equal to " + f + " Fahrenheit.");
        } else if (a == 'C') {
            System.out.print("Enter the temperature in F: ");
            int d = sc.nextInt();
            double g = ((d - 32) * 5 / 9);
            System.out.println(d + " Fahrenheit is equal to " + g + " Celcious.");
        } else {
            System.out.println("Invalid Entry !");
        }

    }
}
