import java.util.*;

class Consective {
    static String con(String s) {
        String s2 = " ";
        for (char c : s.toCharArray()) {
            for (int i = 0; i < s.length(); i++) {
                if (charAt(i) == c && charAt(i + 1) == c) {
                    s.remove(s.charAt(i + 1));
                    s2 = s2 + s.charAt(i);
                }
            }
        }
        return s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(con(s));
    }
}