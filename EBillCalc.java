import java.util.Scanner;

public class EBillCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        String name = sc.nextLine();

        System.out.print("Enter the Address: ");
        String add = sc.nextLine();

        System.out.print("Enter the Unit: ");
        double unit = sc.nextDouble();

        double amount = unit * 10;
        int discount = 0;

        double temp = amount;

        if (unit >= 1 && unit <= 10) {
            discount = 10;
            temp = temp - (temp * .10);
        } else if (unit > 10 && unit <= 20) {
            discount = 15;
            temp = temp - (temp * .15);
        } else if (unit > 20 && unit <= 40) {
            discount = 30;
            temp = temp - (temp * .30);
        } else if (unit >= 50) {
            discount = 50;
            temp = temp - (temp * .50);
        }

        System.out.println("Name: " + name);
        System.out.println("Address: " + add);
        System.out.println("Units: " + unit);
        System.out.println("Amount: " + amount);
        System.out.println("Discount: " + discount + " %");
        System.out.println("Total Amount after Discount: " + temp);
    }
}
