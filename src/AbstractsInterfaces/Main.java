package AbstractsInterfaces;

public class Main {
    public static void main(String[] args) {

        DialPhone vertu = new DialPhone(true);
        vertu.setName("Vertu X10");
        vertu.setID("XC3570");
        System.out.println("Dial phone " + vertu.getName() + " has a serial " + vertu.getID());
        vertu.powerOn();
        vertu.powerOff();
        vertu.call();
        vertu.autoAnswer();
        System.out.println();

        SmartPhone S10 = new SmartPhone("Android", 12, 12345);
        S10.setName("Samsung S10");
        S10.setID("FD4455");
        System.out.println("SmartPhone " + S10.getName() + " has a serial " + S10.getID() + ". The OS is " + S10.getOS() + ". Simcount is " + S10.getSimcount());
        S10.powerOn();
        S10.powerOff();
        S10.call();
        S10.runApp();
        System.out.println();

        Multicook bosch = new Multicook();
        bosch.setName("Bosch");
        bosch.setID("KKK445");
        System.out.println("Multicooker " + bosch.getName() + " has ID " + bosch.getID());
        bosch.powerOn();
        bosch.powerOff();
        bosch.cook();
        bosch.switchProgram(5);
        System.out.println();

        Oven hansa = new Oven();
        hansa.setName("Hansa");
        hansa.setID("44545");
        System.out.println("Oven " + hansa.getName() + " has ID " + hansa.getID());
        hansa.powerOn();
        hansa.powerOff();
        hansa.cook();
        hansa.initTimer(120);
        System.out.println();

        offAll(S10, vertu, bosch, hansa);
    }
        static void offAll (AbstractDevice...devices){
            for (AbstractDevice d : devices) {
                d.powerOff();
            }
        }
}
