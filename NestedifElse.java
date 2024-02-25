public class NestedifElse {
    public static void main(String[] args) {
        int a = 56;
        int b = 35;
        if (a > 50) {
            System.out.println("I'm greater then 50");
            if (b > 40) {
                System.out.println("I'm greater the 40");
            } else {
                System.out.println("Oh ,no i'm smaller..");
            }
        }
    }
}
