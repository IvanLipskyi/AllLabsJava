package abstractsInterfaces.interfaces;

public class Main2 {
    public static void main(String[] args) {
        SmartPhone nokia = new SmartPhone();
        nokia.call("Mother");
        nokia.createMail("Hello Mom. I'm fine");
        nokia.editMail("Hello Mom. I'm not fine");
        nokia.sendMail("Press the button \"send\" to send mail");
        System.out.println();

        DialPhone vertu = new DialPhone();
        vertu.call("father");
        System.out.println();

        Post yahoo = new Post();
        yahoo.createMail("Hello people");
        yahoo.sendMail("Go go go");
        System.out.println();

        sendAll(nokia, yahoo);
    }
    static void sendAll (MailSender...varArgs){
        for (MailSender md: varArgs) {
            md.sendMail("Send mail");
        }
    }
}
