import java.util.Scanner;

public class College {
    void meth1() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 1) {
            System.out.println("WELCOME TO DEANS PORTAL");
            System.out.println("1)Rohith(HOD of Computer Science and engineering)");
            System.out.println("2)Virat (Hod Electronics and communication engineering)");
            System.out.println("3)Dhoni (Hod of Civil engineering )");
            System.out.println("4)Gambhir (Hod of physical department)");
            System.out.println("5)Sachin(Hod of Law )");
            System.out.println("please enter the number whome details you want to");
            int i = sc.nextInt();
            if (i == 1) {
                System.out.println("NAME:ROHITH");
                System.out.println("NATIVE:NELLORE");
                System.out.println("EDUCATION:PHD, IIT BOMBAY");
                System.out.println("WORKING: VIT-AP UNIVERSITY");
                System.out.println("CABIN NUMBER:CB-104-A");
            } else if (i == 2) {
                System.out.println("NAME:VIRAT");
                System.out.println("NATIVE:ONGOLE");
                System.out.println("EDUCATION:PHD, IIT MADRAS");
                System.out.println("WORKING: VIT-AP UNIVERSITY");
                System.out.println("CABIN NUMBER:CB-121-G");
            } else if (i == 3) {
                System.out.println("NAME:DHONI");
                System.out.println("NATIVE:KADAPA-C");
                System.out.println("EDUCATION:PHD, IIM BANGALURU");
                System.out.println("WORKING: VIT-AP UNIVERSITY");
                System.out.println("CABIN NUMBER:AB1-121");
            } else if (i == 4) {
                System.out.println("NAME:GAMBHIR");
                System.out.println("NATIVE:VIZAG");
                System.out.println("EDUCATION:PHD, NIT WARANGAL");
                System.out.println("WORKING: VIT-AP UNIVERSITY");
                System.out.println("CABIN NUMBER:CB-124-F");
            } else if (i == 5) {
                System.out.println("NAME:SACHIN");
                System.out.println("NATIVE:VIJAYAWADA");
                System.out.println("EDUCATION:PHD, IIT KHARAGPUR");
                System.out.println("WORKING: VIT-AP UNIVERSITY");
                System.out.println("CABIN NUMBER:CB-121-H");
            }

        } else if (number == 2) {

            System.out.println("WELCOME TO FACULTY PORTAL");
            System.out.println("1)Arun Kumar ");
            System.out.println("2)Raghunandan ");
            System.out.println("3)Hari Yadav");
            System.out.println("4)Pramila");
            System.out.println("5)Kishan");
            System.out.println("Please enter the number which faculty details you want");

            int j = sc.nextInt();
            if (j == 1) {
                System.out.println("NAME:Arun kumar");
                System.out.println("NATIVE:VIJAYAWADA");
                System.out.println("EDUCATION:PHD, IIT KHARAGPUR");
                System.out.println("WORKING: VIT-AP UNIVERSITY");
                System.out.println("CABIN NUMBER:CB-121-H");
                System.out.println("teaching subjects:- java,python");

            } else if (j == 2) {
                System.out.println("NAME:Raghunandan");
                System.out.println("NATIVE:Nellore");
                System.out.println("EDUCATION:PHD, VIT-AP UNIVERSITY");
                System.out.println("WORKING: VIT-AP UNIVERSITY");
                System.out.println("CABIN NUMBER:CB-121-H");
                System.out.println("Teaching Subjects:-Maths, Physics");
            } else if (j == 3) {
                System.out.println("NAME:Hari Yadav");
                System.out.println("NATIVE:Nellore");
                System.out.println("EDUCATION:PHD, VIT-AP UNIVERSITY");
                System.out.println("WORKING: VIT-AP UNIVERSITY");
                System.out.println("CABIN NUMBER:AB1-121-H");
                System.out.println("Teaching Subjects:-Maths, Chemistry");
            } else if (j == 4) {
                System.out.println("NAME:Pramila");
                System.out.println("NATIVE:Nellore");
                System.out.println("EDUCATION:PHD, VIT-AP UNIVERSITY");
                System.out.println("WORKING: VIT-AP UNIVERSITY");
                System.out.println("CABIN NUMBER:CB-121-H");
                System.out.println("Teaching Subjects:-Maths, Physics");
            } else if (j == 5) {
                System.out.println("NAME:Kishan");
                System.out.println("NATIVE:Nellore");
                System.out.println("EDUCATION:PHD, VIT-AP UNIVERSITY");
                System.out.println("WORKING: VIT-AP UNIVERSITY");
                System.out.println("CABIN NUMBER:AB2-121-H");
                System.out.println("Teaching Subjects:-Java, Advanced java");
            }

        } else if (number == 3) {
            System.out.println("WELCOME TO STUDENTS PORTAL");
            System.out.println("1)Hajarath ");
            System.out.println("2)Meeras ");
            System.out.println("3)Ameena");
            System.out.println("4)Haneef");
            System.out.println("5)Rasool");
            System.out.println("6)Bussa");
            System.out.println("Please enter the number which student details do you want");
            int z = sc.nextInt();
            if (z == 1) {
                System.out.println("Name:Hajarath");
                System.out.println("Reg no:21bce9484");
                System.out.println("Branch: Computer science and engineering");
                System.out.println("Mobile no:9988776655");
                System.out.println("Address:Nellore, Andhra Pradesh");
            } else if (z == 2) {
                System.out.println("Name:Meeras");
                System.out.println("Reg no:21bce9494");
                System.out.println("Branch: Computer science and engineering");
                System.out.println("Mobile no:9988771122");
                System.out.println("Address:Nellore, Andhra Pradesh");
            } else if (z == 3) {
                System.out.println("Name:ameena");
                System.out.println("Reg no:21bce9094");
                System.out.println("Branch: Electronics and comunication engineering");
                System.out.println("Mobile no:3344771122");
                System.out.println("Address:Banglore, Karnatak");
            } else if (z == 4) {
                System.out.println("Name:Haneef");
                System.out.println("Reg no:20bce7015");
                System.out.println("Branch:Mechinacl engineering");
                System.out.println("Mobile no:9200998877");
                System.out.println("Address:Miryalaguda, Telangana");
            } else if (z == 5) {
                System.out.println("Name:Rasool");
                System.out.println("Reg no:19bce7015");
                System.out.println("Branch:civil engineering");
                System.out.println("Mobile no:9848424984");
                System.out.println("Address:Hyderabad, Telangana");
            } else if (z == 6) {
                System.out.println("Name:Bussa");
                System.out.println("Reg no:20bce7956");
                System.out.println("Branch:Chemical  engineering");
                System.out.println("Mobile no:9209998377");
                System.out.println("Address:Khammam, Telangana");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to VIT-AP UNIVERSITY");
        System.out.println("1) Details of Deans ");
        System.out.println("2)Details of faculties");
        System.out.println("3) Details of Students");
        System.out.println("Please enter number which one you want ");
        College obj = new College();
        obj.meth1();
    }
}
