//adding 1 to every digit while reverse like: 342 -> 354
public class AvgWhile9 {
    public static void main(String[] args) {

        int i = 342, rev = 0;

        while (i > 0) {
            int rem = i % 10;
            rev = rev * 10 + 1 + rem;
            i = i / 10;
        }
        System.out.println(rev);
    }
}
