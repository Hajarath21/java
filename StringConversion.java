import java.util.*;

import java.util.*;

public class StringConversion {

    public static int minOperations(String A, String B) {
        int n = A.length();

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) < B.charAt(i)) {
                return -1;
            }
        }

        int operations = 0;

        for (char target = 'a'; target <= 'z'; target++) {

            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (A.charAt(i) != B.charAt(i) && B.charAt(i) == target) {
                    indices.add(i);
                }
            }

            if (!indices.isEmpty()) {

                char minChar = 'z' + 1;
                for (int index : indices) {
                    if (A.charAt(index) < minChar) {
                        minChar = A.charAt(index);
                    }
                }

                if (minChar != target) {
                    for (int index : indices) {
                        A = A.substring(0, index) + target + A.substring(index + 1);
                    }
                    operations++;
                }
            }
        }

        return operations;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String A = scanner.nextLine();

        String B = scanner.nextLine();

        int result = minOperations(A, B);

        System.out.println(result);

        scanner.close();
    }
}
