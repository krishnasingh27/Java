public class StarP26 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int k = i; k < 3; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 3; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
