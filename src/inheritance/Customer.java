package inheritance;


import java.io.Serializable;
import java.util.Objects;


public class Customer extends Human implements Serializable {
    private String discountNumber;
    private double money;

    public Customer(String discountNumber, double money, String name, String bday, String phone) {
        super(name, bday, phone);
        this.discountNumber=discountNumber;
        this.money=money;
    }

    void askAbout(){
        System.out.println("How much? What is it?");
    }
    void buy(){
        System.out.println("I want to buy");
    }

    public String getDiscountNumber() {
        return discountNumber;
    }

    public void setDiscountNumber(String discountNumber) {
        this.discountNumber = discountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Double.compare(customer.money, money) == 0 &&
                Objects.equals(discountNumber, customer.discountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discountNumber, money);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "discountNumber='" + discountNumber + '\'' +
                ", money=" + money +
                '}';
    }
}
