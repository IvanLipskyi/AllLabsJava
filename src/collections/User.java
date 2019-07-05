package collections;


import java.util.*;

public class User {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phone);
    }

    /**переопределяем сначала хешкод для поля нейм только
     * закомментировал
     */
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return name.equals(user.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }


    private String phone;

    /**
     *
     * @param age
     * @param name
     * @param phone
     */
    public User(int age, String name, String phone){
        this.age = age;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
    return age + "\n" + name + "\n" + phone;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        HashSet<User> userSet = new HashSet<>();
        User u1 = new User(18,"Ivan","380507778889");
        User u2 = new User(18,"Ivan","380507778889");
        User u3 = new User(25,"Ivan","380507778889");
        userSet.add(u1);
        userSet.add(u2);
        userSet.add(u3);
        for (User u: userSet){
            System.out.println(u + "\n");
        }
    }
}
