public class BasicWhile17 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 5 == 0 && i % 11 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
