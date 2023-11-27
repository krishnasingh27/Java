import java.util.Scanner;

public class BasicWhile14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int i = 1;

        while (i <= 10) {
            int table = num * i;
            System.out.println(table);
            i++;
        }

    }
}
