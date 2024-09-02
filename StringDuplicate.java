import java.util.*;

class StringDuplicate {
    public static void meth(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String sortedstr = new String(ch);
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i < s.length() - 1 && sortedstr.charAt(i) == sortedstr.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(sortedstr.charAt(i) + ", count" + count);
            }
        }
    }

    public static void main(String[] args) {
        String s = "hajarath";
        System.out.println(meth(s));
    }
}