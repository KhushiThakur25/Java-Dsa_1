public class ArmStrong_Recursion {
    static int countDigit(int num){
        if(num == 0){
            return 0;
        }
        return 1 + countDigit(num/10);
    }
    static int powerOfNumber(int num,int pow){
        if(pow == 0){
            return 1;
        }
        return num * powerOfNumber(num, pow-1);
    }
    static boolean isArmstrong(int num,int copy,int sum){
        if(num == 0){
            return sum == copy;
        }
        sum += powerOfNumber(num % 10,countDigit(copy));
        return isArmstrong(num/10, copy, sum);
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(1534,1534,0));
    }
}
