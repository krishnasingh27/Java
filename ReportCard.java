import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Roll No.: ");
        int rollNo = sc.nextInt();

        String a = sc.nextLine();
        System.out.print("Enter the name of Student: ");
        String name = sc.nextLine();

        System.out.print("Enter the Father's Name: ");
        String fname = sc.nextLine();

        System.out.print("Enter the Mother's Name: ");
        String mname = sc.nextLine();

        System.out.print("Enter the Address: ");
        String address = sc.nextLine();

        System.out.print("Enter the Contact No.: ");
        long cNo = sc.nextLong();

        System.out.print("Enter marks of Physics: ");
        int phy = sc.nextInt();

        System.out.print("Enter marks of Chemistry: ");
        int che = sc.nextInt();

        System.out.print("Enter marks of Math: ");
        int math = sc.nextInt();

        int total = phy + che + math;
        double per = total / 3;
        System.out.println("Roll No. " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Fathers name: " + fname);
        System.out.println("Mothers name: " + mname);
        System.out.println("Address: " + address);
        System.out.println("Contact no: " + cNo);
        System.out.println("Physics Marks: " + phy);
        System.out.println("Chemistry Marks: " + che);
        System.out.println("Math Marks: " + math);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + per + "%");

        if (per >= 60 && per <= 100) {
            System.out.println("Division: First Division");
        } else if (per >= 40 && per < 60) {
            System.out.println("Division: Second Division");
        } else if (per >= 25 && per < 40) {
            System.out.println("Division: Third Division");
        } else {
            System.out.println("Fail!");
        }
    }
}
