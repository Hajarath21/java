import java.util.*;

class ArrayReverse {
    public static void rev(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        /*
         * int arr[] = { 1, 2, 3, 4 };
         * int n = arr.length;
         * int reverse[] = new int[n];
         * 
         * for (int i = 0; i < n; i++) {
         * reverse[i] = arr[arr.length - i - 1];
         * }
         * for (int i : reverse) {
         * System.out.print(i + " ");
         * }
         */

        int arr[] = { 1, 2, 3, 4 };
        int n = arr.length;
        rev(arr, 0, 3);
        print(arr, n);
    }
}