import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Math: ");
        int math = sc.nextInt();

        System.out.print("Enter marks of Science: ");
        int sci = sc.nextInt();

        System.out.print("Enter marks of SST: ");
        int sst = sc.nextInt();

        System.out.print("Enter marks of Hindi: ");
        int hin = sc.nextInt();

        System.out.print("Enter marks of English: ");
        int eng = sc.nextInt();

        double grade = (math + sci + sst + hin + eng) / 5;
        System.out.println(grade + " %");

        if (grade >= 80 && grade <= 100) {
            System.out.println("Grade A");
        }

        else if (grade >= 60 && grade < 80) {
            System.out.println("Grade B");
        }

        else if (grade >= 50 && grade < 60) {
            System.out.println("Grade C");
        }

        else if (grade >= 45 && grade < 50) {
            System.out.println("Grade D");
        }

        else if (grade >= 25 && grade < 45) {
            System.out.println("Grade E");
        }

        else {
            System.out.println("Fail");
        }
    }
}
