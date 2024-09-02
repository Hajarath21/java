public class Hash {
    void meth1() {
        System.out.println("------");
    }

    public static void main(String[] args) {
        Hash obj1 = new Hash();
        Hash obj2 = new Hash();
        obj1.meth1();
        System.out.println(obj1.hashCode());
        System.out.println(obj1.equals(obj1));
        System.out.println(obj1.equals(obj2));
        System.out.println("getClass():" + obj1.getClass());
        System.out.println("String:" + obj1.toString());

    }
}