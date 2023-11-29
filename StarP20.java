public class StarP20 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int k = i; k < 3; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
