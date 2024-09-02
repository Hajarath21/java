import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;

class IndexRotedArray {
    public static void main(String[] args) {
        int n = 3;
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int m = arr.length;
        int arr2[] = new int[m];
        for (int i = 0; i < arr.length; i++) {
            if (n < m) {
                arr2[i] = arr[arr.length - 1 - i];
                arr2[arr2.length - 1 - i] = arr[i];
                m--;
            }
        }
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}