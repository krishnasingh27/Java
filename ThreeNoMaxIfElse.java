public class ThreeNoMaxIfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int greatest = a;

        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }

        System.out.println("The Greatest number is " + greatest);

    }
}
