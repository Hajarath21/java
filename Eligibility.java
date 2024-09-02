import java.util.Scanner;

public class Employee {
    static Scanner sc = new Scanner(System.in);

    void checkEligibility(String name, String vehicle) {

        int age = sc.nextInt();
        if (age > 15) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }

    public static void main(String[] args) {

        String name = sc.next();
        String vehicle = sc.next();

        Employee obj = new Employee();
        obj.checkEligibility(name, vehicle);

    }
}
