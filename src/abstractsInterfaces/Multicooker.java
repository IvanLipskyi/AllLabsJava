package abstractsInterfaces;

abstract class Multicooker extends AbstractDevice{
    @Override
    void powerOn(){
        System.out.println("Turn on the button. Multicooker now working");
    }
    @Override
    void powerOff(){
        System.out.println("Multicooker is off");
    }
    abstract void cook();
}
