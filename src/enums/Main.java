package enums;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User ivan = new User("catcatcat", "thebest", Post.ADMIN);
        User liza = new User("lizacandy", "12345", Post.DIRECTOR);
        User vasya = new User("vasyaok", "thankyougod", Post.MANAGER);
        User john = new User ("johnydepp", "john123", Post.CLIENT);
        User olivia = new User("olivka", "olivka22", Post.ANONIM);

        User [] users = {ivan, liza, vasya, john, olivia};

        Store amazon = new Store("Amazon", "www.amazon.com", users);
while(true){
    tryLogin(amazon);
}

    }
    static void tryLogin(Store store) {
        System.out.println("Введите логин:");
        Scanner scan = new Scanner(System.in);
        String login = scan.nextLine();
        System.out.println("Введите пароль:");
        Scanner scan2 = new Scanner(System.in);
        String password = scan.nextLine();
        boolean isAuth = store.login(login, password);
        if (isAuth) {
            store.getCurrentUserRights();
            store.logout();
        } else {
            System.out.println("Неверный логин и/или пароль");
        }
    }
}
