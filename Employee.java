import java.util.Scanner;

public class Employee {
    void Empdetails(String name, int id, String dept, String address) {
        System.out.println(name + " " + id + " " + dept + " " + address);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee name");
        String name = sc.next();
        System.out.println("enter employee id");
        int id = sc.nextInt();
        System.out.println("enter employee dept");
        String dept = sc.next();
        sc.nextLine();
        System.out.println("enter address");
        sc.nextLine();
        String address = sc.next();
        Employee obj = new Employee();
        obj.Empdetails(name, id, dept, address);

    }
}