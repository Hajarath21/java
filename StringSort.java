import java.util.*;

class StringSort {
    public static void main(String[] args) {
        String s = "Abahf192";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}