package abstractsInterfaces;

public class DialPhone extends Phone {
    private boolean hasAnswerPhone;
    public boolean isHasAnswerPhone() {
        return hasAnswerPhone;
    }

    public void setHasAnswerPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }
    @Override
    void powerOn(){
        System.out.println("The dial phone is on");
    }
    @Override
    void powerOff() {
        System.out.println("The dial phone is off");
    }
    @Override
        void call(){
            System.out.println("Select a contact. The dial phone is Calling somebody");
        }
        void autoAnswer(){
            System.out.println("This is auto Answer. I can't pick up my phone. Please, leave a message");
        }
        DialPhone(boolean hasAnswerPhone){
        this.hasAnswerPhone = hasAnswerPhone;
        }
    }
