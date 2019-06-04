package AbstractsInterfaces;

public class Multicook extends Multicooker {
    void switchProgram (int numOfProgram){
        System.out.println("You chose a program number: " + numOfProgram);
    }
    @Override
    void powerOn(){
        super.powerOn();
    }
    @Override
    void powerOff(){
        super.powerOff();
    }
    @Override
    void cook(){
        System.out.println("Multicook is cooking");
    }
}
