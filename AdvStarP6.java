public class AdvStarP6 {
    public static void main(String[] args) {
        int num;
        for (int i = 1; i <= 5; i++) {
            num = 1;
            for (int j = 1; j <= 6; j++) {
                if (j % 2 != 0) {
                    System.out.print(i);
                } else {
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
        }
    }
}
