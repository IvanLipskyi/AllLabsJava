package abstractsInterfaces;

abstract class AbstractDevice{
    private String name;
    private String ID;
    abstract void powerOn();
    abstract void powerOff();
public AbstractDevice(){
    powerOn();
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
