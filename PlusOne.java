public class PlusOne {
    public static void main(String[] args) {
        int[] digits = { 1, 9, 9, 9, 9 };
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            }
            digits[i] = 0;
        }
        // digits = new int[digits.length + 1];
        // digits[0] = 1;

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}
