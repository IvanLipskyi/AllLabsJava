package wrappers;

public class WrapperTest {
    public static void main(String[] args) {

        Integer i1 = 19;
        Long l1 = 500L;
        Float f1 = 5.35f;
        Double d1 = 3.14;
        Boolean isTrue1 = true;
        Character c1 = 'A';
        Byte b1 = 5;

        Integer i2 = Integer.valueOf(190);
        Long l2 = Long.valueOf(5000L);
        Float f2 = Float.valueOf(53.56f);
        Double d2 = Double.valueOf(31.48);
        Boolean isTrue2 = Boolean.valueOf(true);
        Character c2 = Character.valueOf('T');
        Byte b2 = Byte.valueOf((byte)50);

        Integer i3 =  new Integer (1900);
        Long l3 = new Long (50000L);
        Float f3 = new Float (4454.66f);
        Double d3 = new Double (34.232323);
        Boolean isTrue3 = new Boolean (false);
        Character c3 = new Character ('g');
        Byte b3 = new Byte ((byte)3);

        Integer i4 = Integer.parseInt("2019");
        Long l4 = Long.parseLong("100000L");
        Float f4 = Float.parseFloat("4.5");
        Double d4 = Double.parseDouble("75.75");
        Boolean isTrue4 = Boolean.parseBoolean("False");
        Byte b4 = Byte.parseByte("25");

        Double got = Double.valueOf(99.99);
        byte sim1 = 9;
        int sim2 = 100;
        long sim3 = 750L;
        short sim4 = 33;
        float sim5 = 3.5f;
        sim1 = (byte)got.doubleValue();
        sim2 = (int)got.doubleValue();
        sim3 = (long)got.doubleValue();
        sim4 = (short)got.doubleValue();
        sim5 = (float)got.doubleValue();

        Double inf1 = 5.75;
        Double inf2 = 0.0;
        Double nanValue = inf1/inf2;
        Double infinityValue = inf2/inf2;
        System.out.println(nanValue);
        System.out.println(infinityValue);
        //Boolean isBad = nanValue == null || Double.isInfinite(infinityValue) ||
        if (Double.isInfinite(infinityValue)) {
            System.out.println("infinitive");
        }
        if (Double.isNaN(nanValue)){
            System.out.println("NaN");
        }
    }
}
