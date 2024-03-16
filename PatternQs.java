public class PatternQs {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int n = rows - i;
            for (int j = 0; j < rows - i; j++) {
                System.out.print(n + " ");
                n--;
            }
            System.out.println();
        }
    }
}
