public class AdvStarP17 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                if ((j == 0 && i <= 4) || (i == 0 && j > 0 && j < 3) ||
                        (i == 2 && j > 0 && j < 3) || (j == 3 && i <= 4) || (i == 4 && j > 0 && j < 3)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
