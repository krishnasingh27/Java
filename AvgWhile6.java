//Factorial of 5
public class AvgWhile6 {
    public static void main(String[] args) {
        int i = 5, fac = 1;
        while (i > 0) {
            fac = fac * i;
            i--;
        }
        System.out.println(fac);
    }
}
