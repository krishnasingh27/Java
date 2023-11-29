public class AdvStarP24 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
