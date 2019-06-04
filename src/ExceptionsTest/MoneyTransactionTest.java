package ExceptionsTest;

public class MoneyTransactionTest {
    private MoneyTransactionTest(){
        System.out.println("Test created");
    }
    static void sendTo(long card1, long card2, int sum ) throws RuntimeException{
        if (card1 == card2) {
            throw new RuntimeException();
        }
        if (sum == 0 || sum > 100_000 || sum <0){
            throw new RuntimeException();
        }
        System.out.println("Сумма " + sum + " cо счета " + card1 + " успешно переведа на счет " + card2);
    }
}
