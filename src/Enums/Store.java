package Enums;

public class Store {
    private String nameStore;
    private String URL;
    private User [] users;

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getU1() {
        return u1;
    }

    public void setU1(User u1) {
        this.u1 = u1;
    }

    private User u1;

   Store (String nameStore, String URL, User[] users){
       this.nameStore=nameStore;
       this.URL=URL;
       this.users=users;
   }
   boolean login (String login, String password){
       for (User user: users){
           if (user.getLogin().equals(login) && user.getPassword().equals(password)){
    u1=user;
    return true;
           }
       }
       return false;
   }
   void getCurrentUserRights(){
       switch (u1.getPost()){
           case DIRECTOR:
               System.out.println("Директор магазина,может управлять кадрами и ценами");
               break;
           case ADMIN:
               System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
               break;
           case MANAGER:
               System.out.println("Менеджер магазина, может общаться с клиентами");
               break;
           case CLIENT:
               System.out.println("Клиент магазина, может покупать товар и пользоваться дисконтом");
               break;
           case ANONIM:
               System.out.println("Анонимный пользователь,может покупать товары и/или авторизироваться");
               break;
           default:
               System.out.println("ERROR");
       }
   }
   void logout (){
       u1 = null;
       System.out.println("Пользователь вышел из системы");
   }
}
