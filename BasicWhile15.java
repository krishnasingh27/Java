import java.util.Scanner;

public class BasicWhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        while (start <= end) {
            int i = 1;
            while (i <= 10) {
                int mul = start * i;
                System.out.println(mul);
                i++;
            }
            System.out.println();
            start++;
        }
    }
}
