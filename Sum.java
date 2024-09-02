import java.util.*;

class Sum {
    static int sumOfArray(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];

        }
        return total;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 9, 8, 2, 12 };
        int res = sumOfArray(arr);
        int singleDigit = single(res);
        System.out.println(singleDigit);
    }

    static int single(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }

    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}