package packages.transport;

public class Passport {
    private String Name;
    private int horsePower;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
}
