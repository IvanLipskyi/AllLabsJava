package Lambdas;

public class LambdaTest {
    static String stringOp(Testable tt, String t ){
        return tt.func(t);
    }

    public static void main(String[] args) {
    String num1 = "Hello damn world";
    String num2;
    String num3;
        System.out.println("this is the original string:" + num1);
        num2 = stringOp((str) -> str.toUpperCase(), num1 );
        System.out.println("After changing: " + num2);
        num3 = stringOp((str)->str.toLowerCase(), num1);
        System.out.println(num3);
    }
}
