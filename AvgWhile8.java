//Digit Count
public class AvgWhile8 {
    public static void main(String[] args) {
        int i = 1234, count = 0;
        while (i > 0) {
            i = i / 10;
            count++;
        }
        System.out.println("There are " + count + " digits");
    }
}
