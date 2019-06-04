package AbstractsInterfaces.Interfaces;

public class DialPhone implements Caller {
    @Override
    public void call(String contact) {
        System.out.println("Take your phone, choose a contact and it will call - " + contact);
    }
}
