public class Biku {
    void meth1(int i) {
        if (i <= 50) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    void checkEligibility(String name, int age) {
        if (age > 21) {
            System.out.println("Eligible");

        } else {
            // System.out.println("Eligible" + (18 - 3) + "years");
            System.out.println("need " + (3) + " more years to eligible");
        }
    }

    public static void main(String[] args) {
        Biku obj = new Biku();
        obj.meth1(50);
        obj.checkEligibility("Hajarath", 21);

    }

}
