public class AdvStarP25 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            int num = 1;
            for (int j = 0; j <= i * 2; j++) {
                if (j % 2 == 0) {
                    System.out.print(num);
                    num++;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
