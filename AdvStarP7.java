public class AdvStarP7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 5; j++) {
                int number = (5 * (j - 1)) + i;
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
