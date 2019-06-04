package AbstractsInterfaces.Interfaces;

class SmartPhone implements Caller, EmailSender{
    public void call(String contact) {
        System.out.println("Calling to " + contact);
    }

    @Override
    public String createMail(String mail) {
        System.out.println("Create message: " + mail);
        return null;
    }

    @Override
    public String editMail(String mail) {
        System.out.println("Edit message: " + mail);
        return null;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("SmartPhone send message: " + mail);
    }
}
