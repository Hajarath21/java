import java.util.Scanner;

public class Restaurant {
    void meth1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome t0 Family Restaurant");
        System.out.println("how many table you want to book");
        int noofTables = sc.nextInt();
        System.out.println("please enter row number");
        int row = sc.nextInt();
        System.out.println("please enter seat no");
        int Seatno = sc.nextInt();
        System.out.println("please enter your names");
        String names[] = new String[noofTables];
        System.out.println("please enter" + noofTables + "names");
        for (int i = 0; i <= names.length - 1; i++) {
            names[i] = sc.next();

        }
        System.out.println(names.length + "tables were booked");
        for (int i = 0; i <= names.length; i++, row++, Seatno++) {
            System.out.println(names[i] + "-" + row + "-" +
                    Seatno);
        }

    }

    public static void main(String[] args) {
        new Restaurant().meth1();
    }
}