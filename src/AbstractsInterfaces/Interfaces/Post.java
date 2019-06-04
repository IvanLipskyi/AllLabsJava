package AbstractsInterfaces.Interfaces;

public class Post implements MailSender {
    @Override
    public String createMail(String mail) {
        System.out.println("Create message "  + mail);
        return null;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Post sending message: " + mail);
    }
}
