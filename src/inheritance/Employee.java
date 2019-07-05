package inheritance;

import java.io.Serializable;
import java.util.Objects;

public class Employee extends Human implements Serializable {
    private String acceptedDate;
    private double salary;
    private boolean isWorking;

    void comeOnWork(){
        System.out.println("I'm on work today");
    }
    void haveLunch(){
        System.out.println("I'm eating");
    }
    void doWork(){
        System.out.println("I'm working");
    }

    public Employee(String name, String bday, String phone, String acceptedDate, double salary, boolean isWorking) {
        super(name, bday, phone);
        this.acceptedDate=acceptedDate;
        this.salary = salary;
        this.isWorking=isWorking;
    }

    public String getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(String acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                isWorking == employee.isWorking &&
                Objects.equals(acceptedDate, employee.acceptedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceptedDate, salary, isWorking);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "acceptedDate='" + acceptedDate + '\'' +
                ", salary=" + salary +
                ", isWorking=" + isWorking +
                '}';
    }
}
