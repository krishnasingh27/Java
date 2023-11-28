//adding 1 to every digit like: 342 => 453
public class AvgWhile10 {
    public static void main(String[] args) {

        int i = 342, rev = 0;

        while (i > 0) {
            int rem = i % 10;
            rev = rev * 10 + 1 + rem;
            i = i / 10;
        }
        int rev2 = 0;
        while (rev > 0) {
            int rem2 = rev % 10;
            rev2 = rev2 * 10 + rem2;
            rev /= 10;
        }
        System.out.println(rev2);
    }
}
