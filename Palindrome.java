public class Palindrome {
    public static void main(String[] args) {
        int n = 12231;
        int org = n;
        int rev = 0, rem;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if (org == rev) {
            System.out.println("Number is Palindrome..");
        } else {
            System.out.println("Number is not Palindrome..");
        }
    }
}
