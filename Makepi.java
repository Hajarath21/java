import java.util.Arrays;

public class Makepi {

    public int[] makepi() {
        int arr[] = { 3, 1, 4 };

        return arr;

    }

    public static void main(String[] args) {

        Makepi obj = new Makepi();
        int[] result = obj.makepi();
        System.out.println(Arrays.toString(result));
    }

}