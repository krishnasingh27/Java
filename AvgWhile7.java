//Fibanacci Series
public class AvgWhile7 {
    public static void main(String[] args) {
        int a = 0, b = 1, c, i = 1;
        while (i <= 10) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}
