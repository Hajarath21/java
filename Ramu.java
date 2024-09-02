import java.util.*;

public class Ramu {
    void meth1() {
        String s1 = "Hajarath";
        String s2 = new String("Meeras");
        char arr[] = { 's', 'a', 'j', 'j', 'u' };
        String s3 = new String(arr);
        String s4 = new String(arr, 1, 2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1.length());
        System.out.println(s1.concat(" is awesome"));
        System.out.println(s1);
        // String which were created by using String class are Immutable
        String s = s1.concat(" is awesome");
        System.out.println(s);

    }

    void meth2() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length());
        System.out.println(s.concat(" is power"));

    }

    public static void main(String[] args) {
        Ramu obj = new Ramu();
        obj.meth1();
        obj.meth2();
    }
}
