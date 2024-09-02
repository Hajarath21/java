import java.util.*;

class MaxArray {

    /*
     * public static void main(String[] args) {
     * int arr[] = { 3, 5, 2, 7, 8, 1 };
     * Arrays.sort(arr);
     * int n = arr.length;
     * int min = arr[0];
     * int max = arr[n - 1];
     * 
     * System.out.println(min);
     * System.out.println(max);
     */
    public static int minv(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxv(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 7, 8, 1 };
        int n = arr.length;
        System.out.println(minv(arr, n));
        System.out.println(maxv(arr, n));
    }
}
