package packages.Test;

import packages.citizen.Passport;
import packages.citizen.PassportUtil;
import static packages.citizen.PassportUtil.marriageRegistration;

public class CitizenMain {
    public static void main(String[] args) {
        Passport Ivan = new Passport ();
        Ivan.setId(555555);
        Passport Liza = new Passport ();
        Liza.setId(666666);
        System.out.println(Ivan.getSpouseID() + " " + Liza.getSpouseID());
        PassportUtil.marriageRegistration(Ivan, Liza);
        System.out.println(Ivan.getSpouseID() + " " + Liza.getSpouseID());

    }
}
