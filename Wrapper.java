public class Wrapper {
    void meth1() {
        System.out.println("performing autboxing");
        int i = 10;
        Integer ival1 = i;
        Integer ival2 = new Integer(i);
        Integer ival3 = Integer.valueOf(i);
        System.out.println("int PDT:" + i);
        System.out.println("Integer WCO:" + ival1);
        System.out.println("Integer WCO:" + ival2);
        System.out.println("Integer WCO:" + ival3 + "\n");

        byte b = 50;
        Byte bval = Byte.valueOf(b);
        System.out.println(b);
        System.out.println("WCO:" + bval + "\n");
        char c = 'A';
        Character cval = new Character(c);
        System.out.println("WCO:" + cval);

    }

    void meth2() {
        System.out.println("performing auto-unboxing");
        Integer ival = new Integer("500");
        Integer ival1 = Integer.valueOf("500");
        System.out.println(ival);
        System.out.println(ival1);
        Boolean booleanval = new Boolean("truikuhjgfe");
        System.out.println(booleanval);

    }

    public static void main(String[] args) {
        Wrapper obj = new Wrapper();

        obj.meth1();
        obj.meth2();
    }
}