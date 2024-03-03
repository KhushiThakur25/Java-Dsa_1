public class ReverseNumber {
    public static void main(String[] args) {
        int n = 6523;//652 // 65 //6
        int rev = 0;
        int rem;
        // 3256
        while (n > 0) {
            rem = n % 10;//3->2->5->6
            rev = rev * 10 + rem; //0*10 + 3 = 3
                                    //3*10 + 2 = 32
            n /= 10;                   //32 * 10 + 5 = 325
        }        
                                     //325 * 10 + 6 = 3256
        System.out.println("Reverse of a number is " + rev);
    }
}
