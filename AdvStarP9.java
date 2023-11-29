public class AdvStarP9 {
    public static void main(String[] args) {
        int num;
        for (int i = 1; i <= 5; i++) {
            num = i;
            for (int j = 1; j <= 5; j++) {
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}
