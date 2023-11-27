import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of Employee: ");
        String name = sc.nextLine();

        System.out.print("Enter the Address: ");
        String add = sc.nextLine();

        System.out.print("Enter the Account No.: ");
        long aNo = sc.nextLong();

        System.out.print("Enter the Salary: ");
        double sal = sc.nextDouble();

        System.out.print("Enter the No. of Hoidays: ");
        int hol = sc.nextInt();

        double temp = sal;

        if (hol > 1 && hol <= 5) {
            temp = temp - (temp * .05);
        } else if (hol > 5 && hol <= 14) {
            temp = temp - (temp * .10);
        } else if (hol == 15) {
            temp = temp - (temp * .50);
        } else if (hol == 1) {
            temp = temp * 1;
        } else {
            temp = 0;
        }

        System.out.println("Name: " + name);
        System.out.println("Address: " + add);
        System.out.println("Account Number: " + aNo);
        System.out.println("Total Salary: " + sal);
        System.out.println("Leave: " + hol);
        System.out.println("Net Salary Payble: " + temp);
    }
}
