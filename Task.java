import java.util.Scanner;
import java.util.Arrays;
import java.util.io;

/*public class Task {
    boolean[] meth1(int arr1[], String data[], Char arr2[]) {

        for (int x : arr1) {
            System.out.println(arr1[i]);
            boolean[] result= new boolean[arr1.length];
            return result;

        }

    }

    public static void main(String[] args) {
       int arr1[]  =  { 2, 3, 4, 5 };
       String data[] = {"haja", " meer", " ameena"};
        arr2 = new Char[] { 'a', 'c', 'd' };

        Task obj = new Task();
        boolean[] result= obj.meth1(arr1, data, arr2);
        for(int result:value){
            System.out.println(value)

        }

    }
} */
public class Task {
    public boolean[] meth1(int arr1[], String data[], char arr2[]) {
        // Print all the statements in the data array
        for (String statement : data) {
            System.out.println(statement);
        }

        // Assuming you want to return a boolean array of the same length as arr1
        boolean[] result = new boolean[arr1.length];

        // Your further logic goes here

        return result;
    }

    public static void main(String[] args) {
        // Creating an instance of ClassA
        Task obj = new Task();

        // Sample arrays for demonstration
        int[] arr1 = { 1, 2, 3 };
        String[] data = { "Statement 1", "Statement 2", "Statement 3" };
        char[] arr2 = { 'a', 'b', 'c' };

        // Calling meth1 method and printing its return value
        boolean[] result = obj.meth1(arr1, data, arr2);
        System.out.println("Return value of meth1:");
        for (boolean value : result) {
            System.out.print(value + " ");
        }
    }
}
