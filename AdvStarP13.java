public class AdvStarP13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= 5 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
