public class Condition {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        if (a > b) {
            if (a > c) {
                System.out.println("a is bigger");

            } else {
                System.out.println("c is bigger");
            }
        } else {
            if (b > c) {
                System.out.println(" b is bigger");
            } else {
                System.out.println("c is bigger");
            }
        }
    }

}
