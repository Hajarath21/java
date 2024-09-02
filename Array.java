import java.util.Arrays;
import java.io.*;

public class Array {
    void meth1() {

        int arr1[];
        arr1 = new int[5];
        int arr2[] = new int[3];
        int arr3[] = { 10, 20, 30, 40 };
        int arr4[] = new int[] { 1, 2, 3, 4, 5 };
        String s = "java";
        System.out.println("------lengthof the Array---------");
        System.out.println("arr1 length:" + arr1.length);
        System.out.println("arr2 length:" + arr2.length);
        System.out.println("arr3 length:" + arr3.length);
        System.out.println("String  length:" + s.length());
        System.out.println("---------Array data---------");
        System.out.println("arr1:" + Arrays.toString(arr1));
        System.out.println(s);
        arr1[1] = 40;
        arr1[3] = 20;
        System.out.println(Arrays.toString(arr1));

        int mat[][] = new int[][] { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(mat[2][2]);

    }

    public static void main(String[] args) {
        new Array().meth1();
    }
}