import java.util.Arrays;

public class ArrayTask1 {
    /*
     * int[] meth1() {
     * int arr[] = { 2, 3, 2 };
     * // arr[2] = 0;
     * for (int i = 0; i < 2; i++) {
     * if (arr[i] == 2 & arr[i + 1] == 3)
     * arr[i + 1] = 0;
     * }
     * return arr;
     * 
     * }
     */
    /*
     * int meth3(int[] arr) {
     * if (arr.length >= 2) {
     * return arr[0] + arr[1];
     * } else if (arr.length == 1) {
     * return arr[0];
     * } else {
     * return 0;
     * }
     * 
     * }
     */
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 4, 2 };

        ArrayTask1 obj = new ArrayTask1();
        boolean result = obj.firstLast6(nums);
        System.out.println(result);
        // int[] result = obj.meth1();
        // System.out.println(Arrays.toString(result));
        // int arr[] = { 1, 2, 3 };
        // ArrayTask1 obj = new ArrayTask1();
        // int result = obj.meth3(arr);
        // System.out.println(result);

    }
}