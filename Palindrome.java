
import java.util.*;

class Solution {
    static boolean Palindrome(String s) {
        String s2 = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            s2 = ch + s2;
        }
        if (s.equals(s2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Palindrome(s));

    }
}