public class SwapThreeWay {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, temp;
        temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println(a + " " + b + " " + c);
    }
}
