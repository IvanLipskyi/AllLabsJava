package packages.transport;

public class Passport {
    private String transportName;
    private int horsePower;
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;

    @Override
    public String toString() {
        return "Passport{" +
                "transportName='" + transportName + '\'' +
                ", horsePower=" + horsePower +
                ", ownerName='" + ownerName + '\'' +
                ", year=" + year +
                '}';
    }
}
