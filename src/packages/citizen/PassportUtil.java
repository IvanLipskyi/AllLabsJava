package packages.citizen;

public class PassportUtil {
    public static void marriageRegistration(Passport male, Passport female){
        male.setSpouseID(female.getId());
        female.setSpouseID(male.getId());
    }
    private PassportUtil(){
        System.out.println("closed constructor");
    }
}
