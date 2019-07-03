package Inheritance;

import java.io.Serializable;
import java.util.Objects;

public class Human implements Serializable {
    private String name;
    private String bday;
    private String phone;

    public Human(String name, String bday, String phone) {
        this.name = name;
        this.bday = bday;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void sayHello(){
        System.out.println("Hello!");
    }
    void sayBye(){
        System.out.println("GoodBye!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(bday, human.bday) &&
                Objects.equals(phone, human.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bday, phone);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", bday='" + bday + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
