package inheritance;

public class Supermarket {
    public Supermarket(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    private String name;
    private String adress;
    Manager man1;
    Cashier cas1;
    Guard gua1;
    Customer cus1;

    void open(){
        System.out.println("The shop is opened");
    }
    void getLunch(){
        System.out.println("We are going on lunch");
    }
    void sellGoods(){
        System.out.println("We are selling goods");
    }

    public static void main(String[] args) {
        Supermarket silpo = new Supermarket("Silpo", "Sobornyi street, 104");

    }
}
