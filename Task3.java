public class Task3 {
    public boolean meth1(int[] nums) {

        if (nums.length >= 1 && nums[0] == nums[nums.length - 1])
            return true;
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1 };
        Task3 obj = new Task3();
        boolean result = obj.meth1(nums);
        System.out.println(result);
    }
}