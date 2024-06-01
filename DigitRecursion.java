public class DigitRecursion {
    static void show(int n) {
        if (n == 0) {
            return;
        }
        show(n / 10);
        System.out.println(n % 10);

    }

    public static void main(String[] args) {
        show(12345);
    }
}
