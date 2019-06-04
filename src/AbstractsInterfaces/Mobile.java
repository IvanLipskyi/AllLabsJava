package AbstractsInterfaces;

public class Mobile extends Phone {
    private int simcount;

    public int getSimcount() {
        return simcount;
    }

    public void setSimcount(int simcount) {
        this.simcount = simcount;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    private int display;
    @Override
    void powerOn(){
        System.out.println("Press the button. The mobile is on");
    }
    @Override
    void powerOff(){
        System.out.println("Press the button. The mobile is off");
    }
    @Override
    void call() {
        System.out.println("Select the contact. Calling somebody");
    }
    Mobile (int simcount, int display){
        this.simcount = simcount;
        this.display = display;
    }
}
