package ExceptionsTest;

public class UserBank {
    public static void main(String[] args) {
       try {
           MoneyTransactionTest.sendTo(123456, 198765, 50);
       } catch (RuntimeException e){
           System.out.println("При обработке банком транзакции произошла ошибка!");
       }
    }
}
