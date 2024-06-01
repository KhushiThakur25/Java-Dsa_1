public class Recursion {
    static void print_name(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Riya");
        print_name(n - 1);
        System.out.println("Sharma");
    }

    public static void main(String[] args) {
        int n = 5;
        print_name(n);
    }
}
