package Concurrency;

public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private int maxSpeed;
public Car (String name, int maxSpeed){
    this.name = name;
    this.maxSpeed = maxSpeed;
}
}
