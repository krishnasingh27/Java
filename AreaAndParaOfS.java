import java.util.Scanner;

public class AreaAndParaOfS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area Or pera: ");
        String a = sc.nextLine();

        if (a.equals("area")) {
            System.out.print("Enter the shape(rec, sq or tri): ");
            String b = sc.nextLine();

            if (b.equals("rec")) {
                System.out.print("Enter the length of rectangle: ");
                int len = sc.nextInt();
                System.out.print("Enter the width of rectangle: ");
                int wid = sc.nextInt();
                int area = len * wid;
                System.out.println("The area of rectangle is " + area);

            } else if (b.equals("sq")) {
                System.out.print("Enter the side of square:");
                int side = sc.nextInt();
                int area = side * side;
                System.out.println("The area of square is " + area);

            } else if (b.equals("tri")) {
                System.out.println("Enter the base and height of triangle:");
                int base = sc.nextInt();
                int height = sc.nextInt();
                double area = 0.5 * base * height;
                System.out.println("The area of triangle is " + area);

            } else {
                System.out.println("Enter valid shape.");
            }

        } else if (a.equals("pera")) {
            System.out.print("Enter the shape(rec, sq or tri): ");
            String c = sc.nextLine();

            if (c.equals("rec")) {
                System.out.print("Enter the length of rectangle:");
                int len = sc.nextInt();
                System.out.print("Enter the width of rectangle:");
                int wid = sc.nextInt();
                int para = 2 * (len + wid);
                System.out.println("The Perimeter of rectangle is " + para);

            } else if (c.equals("sq")) {
                System.out.print("Enter the side of square:");
                int side = sc.nextInt();
                int para = 4 * side;
                System.out.println("The Perimeter of square is " + para);

            } else if (c.equals("tri")) {
                System.out.println("Enter side1, side2 & side3: ");
                int side1 = sc.nextInt();
                int side2 = sc.nextInt();
                int side3 = sc.nextInt();
                int para = side1 + side2 + side3;
                System.out.println("The Perimeter of triangle is " + para);

            } else {
                System.out.println("Enter valid shape.");
            }

        } else {
            System.out.println("Invalid Entry !");
        }
    }
}
