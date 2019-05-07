package packages;

import packages.citizen.Passport;
import packages.citizen.PassportUtil;

public class Test {
    public static void main(String[] args) {
//        Passport ps1 = new Passport();
//        packages.technics.Passport ps2 = new packages.technics.Passport();
//        packages.transport.Passport ps3 = new packages.transport.Passport();
        Passport Ivan = new Passport ();
        Ivan.setId(555555);
        Passport Liza = new Passport ();
        Liza.setId(666666);
        System.out.println(Ivan.getSpouseID() + " " + Liza.getSpouseID());
        PassportUtil.marriageRegistration(Ivan, Liza);
        System.out.println(Ivan.getSpouseID() + " " + Liza.getSpouseID());
    }
}
