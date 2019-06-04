package Enums;

public class User {
    String login;
    String password;
    String name;
    Enum1 role = Enum1.ANONIM;

    public enum Enum1 {
        DIRECTOR,
        ADMIN,
        MANAGER,
        CLIENT,
        ANONIM;
    }
    public User(String login, String password, String name){
        this.login = login;
        this.password = password;
        this.name = name;
    }
}
