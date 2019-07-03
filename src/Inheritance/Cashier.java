package Inheritance;

import java.io.Serializable;
import java.util.Objects;

public class Cashier extends Employee implements Serializable {
    private int cashNum;
    void countMoney(){
        System.out.println("Count money");
    }
    @Override
    void doWork(){
        System.out.println("I'm counting goods and accept payments");
    }

    public Cashier(int cashNum, String name, String phone, String bday, String acceptedDate, double salary, boolean isWorking) {
    super(name, bday, phone, acceptedDate, salary, isWorking);
    this.cashNum=cashNum;
    }

    public int getCashNum() {
        return cashNum;
    }

    public void setCashNum(int cashNum) {
        this.cashNum = cashNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return cashNum == cashier.cashNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cashNum);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "cashNum=" + cashNum +
                '}';
    }
}
