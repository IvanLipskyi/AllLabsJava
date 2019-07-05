package inheritance;

import java.io.Serializable;
import java.util.Objects;

public class Manager extends Employee implements Serializable {
    private String department;

    void consult(){
        System.out.println("I'm consulting");
    }
    void sayAboutDiscount(){
        System.out.println("I'm telling about discount");
    }
    void advise(){
        System.out.println("I'm advising");
    }
    @Override
    void doWork(){
        System.out.println("I'm managing the work of people");
    }

    public Manager(String department, String name, String phone, String bday, String acceptedDate, double salary, boolean isWorking) {
    super(name, bday, phone, acceptedDate, salary, isWorking);
    this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                '}';
    }
}

