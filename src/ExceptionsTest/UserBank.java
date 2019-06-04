package ExceptionsTest;

public class UserBank {
    public static void main(String[] args) {
       try {
           MoneyTransactionTest.sendTo(198765, 198795, 0);
       } catch (AccountException e){
           System.out.println("Ошибка. Номера карт совпадают");
       }
       catch (MoneyValueException e) {
           System.out.println("Ошибка при введении суммы. Введите, пожалуйста, сумму от 1 до 100,000");
       }
    }
}
