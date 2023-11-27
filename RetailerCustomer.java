import java.util.Scanner;

public class RetailerCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Customer Type(retailer or customer): ");
        String cType = sc.nextLine();

        if (cType.equals("retailer")) {

            System.out.print("Enter the Name: ");
            String name = sc.nextLine();

            System.out.print("Enter no of pieces: ");
            int unit = sc.nextInt();

            int discount = 0;

            if (unit >= 1 && unit <= 15) {
                discount = 15;
            } else if (unit > 15 && unit <= 30) {
                discount = 25;
            } else if (unit > 30 && unit < 50) {
                discount = 50;
            }

            System.out.println("Retailer Name: " + name);
            System.out.println("Pieces: " + unit);
            System.out.println("Discount: " + discount + " %");

        }

        else if (cType.equals("customer")) {
            System.out.print("Enter the Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Conatct No.: ");
            String cNo = sc.nextLine();

            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();

            int discount = 0;

            double temp = amt;

            if (temp >= 100 && temp <= 1000) {
                discount = 5;
                temp = temp - (temp * .05);
            } else if (temp > 1000 && temp <= 2000) {
                discount = 10;
                temp = temp - (temp * .10);
            } else if (temp > 2000 && temp <= 3000) {
                discount = 15;
                temp = temp - (temp * .15);
            } else if (temp > 3000) {
                discount = 30;
                temp = temp - (temp * .30);
            }

            System.out.println("Name: " + name);
            System.out.println("Units: " + cNo);
            System.out.println("Amount: " + amt);
            System.out.println("Discount: " + discount + " %");
            System.out.println("Total Amount after Discount: " + temp);
        }

    }
}
