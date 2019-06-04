package ExceptionsTest;

public class StackOverFlowTest {
    static int count;

    static void test() {
        try {
            count++;
            System.out.println(count);
            test();
        } catch (StackOverflowError e) {
            System.out.println("\n" + "Ошибка");
        }
    }

    public static void main(String[] args) {
        test();
    }
}