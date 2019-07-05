package constructor;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15, "red");
        System.out.println("Circumference: " + circle.getCircumference() + "\tSquare: " + circle.getSquare() + "\tColour: "
                + circle.getColour());
    }
}
