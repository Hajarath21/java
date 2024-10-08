import java.util.*;

class Main {
    static String pre(String[] str) {
        if (str == null || str.length == 0)
            return "";
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" };
        System.out.println(pre(str));
    }
}
