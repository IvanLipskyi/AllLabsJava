package constructor;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Menu of pizza: ");
        Pizza[] menu = new Pizza[4];
        menu[0] = new Pizza("Four cheeses", "Pizza dough,mozzarella, emmantal cheese,", 120, 35);
        menu[1] = new Pizza("Bavarian", "Cheese,bavarian sausages", 130, 30);
        menu[2] = new Pizza("Hawaiian", "Cheese,pineapple,hen", 120, 36);
        menu[3] = new Pizza("Carbonare", "Cheese,balyk,bow,egg", 135, 38);
    }
}
