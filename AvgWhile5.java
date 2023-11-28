//Printing prime number from 1 to 100
public class AvgWhile5 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {

            int k = 1, count = 0;
            while (k <= i) {
                if (i % k == 0) {
                    count++;
                }
                k++;
            }
            if (count == 2) {
                System.out.println(i);
            }
            i++;
        }
    }
}
