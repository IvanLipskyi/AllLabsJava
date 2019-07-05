package abstractsInterfaces;

public class Oven extends Multicooker {
    @Override
    void powerOn(){
        super.powerOn();
    }
    @Override
    void powerOff(){
        super.powerOff();
    }
    void initTimer(int seconds){
        System.out.println("Set the cook time: " + seconds);
    }
    @Override
    void cook(){
        System.out.println("I'm cooking");
    }
}
