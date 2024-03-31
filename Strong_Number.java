public class Strong_Number {
    static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }

    static boolean isStrong(int n){
        int org = n;
        int sum = 0;
        while (n != 0) {
            int digit = n %10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == org;
    }
    public static void main(String[] args) {
        int n = 156;
        if(isStrong(n)){
            System.out.println("Number is Strong..");
        }else{
            System.out.println("Number is not Strong..");
        }
    }
}
