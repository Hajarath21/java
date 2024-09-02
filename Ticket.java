import java.util.*;
import java.io.*;

class Ticket {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age < 15) {
            System.out.println("Child Ticket");
        } else {
            System.out.println("Adult Ticket");
        }
    }
}
