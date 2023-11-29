public class AdvStarP3 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(count + " ");
                count += 2;
            }
            System.out.println();
        }
    }
}
