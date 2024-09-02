import java.util.*;

class PAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int product = 0;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] * arr[j] > product) {
                    product = arr[i] * arr[j];
                    sum = arr[i] + arr[j];
                }
            }
        }
        System.out.println(sum);

    }
}