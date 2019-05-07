package ua.zp.brain;

public class MathUtil {
    public static int sum(int ...values) {
        int result = 0;
        for(int a: values) {
            result += a;
        }
        return result;
    }
    public static int mul(int ...values) {
        int result = 1;         // FIXED!
        for (int a: values) {
            result *= a;
        }
        return result;
    }
    public static void printWithSkip(int skipValue, int ...values) {
        // FIXED!
        for(int a: values) {
            if (a == skipValue){
                continue;
            }
            System.out.print(a+" ");
        }
    }
    public static void printToValue(int interruptValue, int ...values) {
        // FIXED!
        for(int a: values) {
            if (a == interruptValue){
                break;
            }
            System.out.print(a+" ");
        }
    }
    public static int factorial(int a) {
        int result = 1;
        for (int i = a; i > 1; i--) {
            result = result * i;
        }
        // FIXED!
        return result;
    }
    public static int geometricProgression(int a, int q, int count) {
        int result = a;
        for (int i = 0; i < count; i++) {
            result = result * q;
        }
        // FIXED!
        return result;
    }
    public static int arithmeticProgression(int a, int q, int count) {
        int result = a;
        for (int i = 0; i < count; i++){
            result = result + q;
        }
        // FIXED!
        return result;
    }

    private MathUtil() {
        // Denied to create instance of this class
    }
}
