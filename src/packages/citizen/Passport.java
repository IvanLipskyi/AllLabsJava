package packages.citizen;

public class Passport {
    private String name;
    private int id;
    private int spouseID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpouseID() {
        return spouseID;
    }

    public void setSpouseID(int spouseID) {
        this.spouseID = spouseID;
    }
}
