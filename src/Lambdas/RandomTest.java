package Lambdas;

public class RandomTest {
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 1;
        int i3;
        System.out.println(i1 + "\n" + i2);
        for (int i = 3; i <=11 ; i++) {
            i3 = i1+i2;
            i1 = i2;
            i2 = i3;
            System.out.println(i3);
        }
    }
}
