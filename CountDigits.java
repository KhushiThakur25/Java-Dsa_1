public class CountDigits {
    public static void main(String[] args) {
        int n = 12365;
        int count = 0;
        while (n > 0) {
            count += 1;
            n /= 10;
        }
        System.out.println("The number of digits are.." + count);
    }
}
