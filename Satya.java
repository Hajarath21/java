public class Satya {
    void meth1() {
        System.out.println("hajarath");
        new Satya();

    }

    Satya() {
        System.out.println("bellamkonda");
        new Satya(300);

    }

    Satya(int a) {
        System.out.println("rasool:" + a);
    }

    public static void main(String[] args) {
        Satya obj = new Satya();
        obj.meth1();
        new Satya(100);
    }
}