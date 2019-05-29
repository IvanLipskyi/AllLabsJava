package packages.Test;

import packages.transport.Passport;

public class TransportMain {
    public static void main(String[] args) {
        Passport tr2 = new Passport();
        tr2.setOwnerName("Ivan");
        System.out.println(tr2.getOwnerName());
//        Passport tr3 = tr2.changeOwner("Ivan0");
        System.out.println(tr2.getOwnerName());
    }
}
