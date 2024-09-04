import java.util.*;

class Vendor {
    String name;
    int age;
    int profit;

    public void meth() {
        System.out.println(this.name);
    }

    Vendor(String name, int age, int profit) {
        System.out.println(name + " " + age + " " + profit);
    }
}

class Oops {
    public static void main(String[] args) {
        Vendor obj = new Vendor("fg", 21, 300);
        obj.name = "Basha";
        obj.age = 26;
        obj.profit = 30000;
        obj.meth();

    }
}