import java.util.Scanner;

public class BasicWhile10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        while (start <= end) {
            if (start % 2 == 0) {
                System.out.println(start);
            }
            start++;
        }
    }
}
