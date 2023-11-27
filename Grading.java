import java.util.Scaner;
import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks in Math: ");
        int math = sc.nextInt();

        System.out.print("Enter the marks in Science: ");
        int sci = sc.nextInt();

        System.out.print("Enter the marks in SST: ");
        int sst = sc.nextInt();

        System.out.print("Enter the marks in Hindi: ");
        int hin = sc.nextInt();

        System.out.print("Enter the marks in English: ");
        int eng = sc.nextInt();

        double avg = (math + sci + sst + hin + eng) / 5;

        if (math >= 40 && sci >= 40 && sst >= 40 && hin >= 40 && eng >= 40) {
            System.out.println("Your Result is " + avg + " %");
        } else {
            System.out.println("You Failed!");
        }
    }
}
