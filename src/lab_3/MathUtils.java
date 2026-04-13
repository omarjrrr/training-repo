package lab_3;

public class MathUtils {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b){
        if (a<b){
            return a;
        }
        else {
            return b;
        }
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static int absolute(int n){
        if (n<0){
            return -n;
        }
        else {
            return n;
        }
    }

    public static double power(double base, int exp){
        double result = 1;
        for (int i = 0; i<exp; i++){
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 10));
        System.out.println(min(5, 10));
        System.out.println(isEven(8));
        System.out.println(absolute(-7));
        System.out.println(power(2, 3));
    }

}
