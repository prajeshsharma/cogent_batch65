package cogent_batch65;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 9;
        Integer b = 8;
        System.out.println(convertInteger(a));
        System.out.println(convertInteger(b));
        String s = "it's so much fun to see the drama of the F1 drivers and their partners on insta￼";
        System.out.println((int) s.charAt(s.length() - 1));
    }

    public static Integer convertInteger(int i) {
        return new Integer(i);
    }

    public static int convertInteger(Integer i) {
        return i.intValue();
    }

    public static Byte convertByte(byte b) {
        return new Byte(b);
    }

    public static byte convertByte(Byte b) {
        return b.byteValue();
    }

    public static Short convertShort(short s) {
        return new Short(s);
    }

    public static short convertShort(Short s) {
        return s.shortValue();
    }

    public static Long convertLong(long l) {
        return new Long(l);
    }

    public static long convertLong(Long l) {
        return l.longValue();
    }

    public static Float convertFloat(float f) {
        return new Float(f);
    }

    public static float convertFloat(Float f) {
        return f.floatValue();
    }

    public static double convertDouble(Double d) {
        return new Double(d);
    }

    public static Double convertDouble(double d) {
        return Double.valueOf(d);
    }

    public static Boolean convertBoolean(boolean b) {
        return new Boolean(b);
    }

    public static boolean convertBoolean(Boolean b) {
        return b.booleanValue();
    }

    public static Character covertCharacter(char c) {
        return new Character(c);
    }

    public static char covertCharacter(Character c) {
        return c.charValue();
    }
}
