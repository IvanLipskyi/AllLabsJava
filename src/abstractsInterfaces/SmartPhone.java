package abstractsInterfaces;

public class SmartPhone extends Mobile{

    private String OS;

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    void runApp(){
        System.out.println("Application is running");
    }

    SmartPhone (String OS, int display, int simcount){
        super(display, simcount);
        this.OS = OS;
    }
}

