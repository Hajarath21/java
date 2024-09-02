import java.util.*;

class MissingNumber {
    static int[] result(int[] arr, int n) {
        int result[] = new int[2];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result[0] = arr[i];
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] >= 2) {
                result[1] = i + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(result(arr, n)));
    }
}