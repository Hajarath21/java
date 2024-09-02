import java.util.*;

class Rage {
    static int diff(int arr[], int n, int m) {

        if (m == 0 || n == 0)
            return 0;
        if (n < m) {
            return -1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int dff = arr[i + m - 1] - arr[i];
            if (dff < min) {
                min = dff;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println(diff(arr, n, m));
    }
}