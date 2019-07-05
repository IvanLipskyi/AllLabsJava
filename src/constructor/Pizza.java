package constructor;

public class Pizza {
    private String name;
    private String composition;
    private double cost;
    private Circle basis;

    Pizza(String name, String composition, double cost, double diametr) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        this.basis = new Circle(diametr / 2);
        System.out.println("Name: " + name + "\tComposition: " + composition + "\tCost: " + cost + "\tDiametr: " + diametr);

    }

    public double getDiameter() {
        return basis.getRadius() * 2;
    }

    public void setDiameter(double diameter) {
        basis.setRadius(diameter / 2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }
}
