package inheritance;

import java.io.Serializable;

public class Guard extends Employee implements Serializable {
    void talk(){
        System.out.println("I'm talking on radio");
    }
    @Override
    void doWork(){
        System.out.println("I'm protecting people and looking for thugs");
}

    public Guard(String name, String phone, String bday, String acceptedDate, double salary, boolean isWorking) {
        super(name, bday, phone, acceptedDate, salary, isWorking);
    }

    @Override
    public String toString() {
        return "Guard{}";
    }
}
