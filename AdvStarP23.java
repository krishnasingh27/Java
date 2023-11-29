public class AdvStarP23 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == j) {
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
