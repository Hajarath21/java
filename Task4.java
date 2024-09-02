import java.util.Arrays;

public class Task4 {
    public boolean meth1(int a[], int b[]) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
            return true;
        return false;

    }

    public static void main(String[] args) {
        int c[] = { 1, 2, 3 };
        int d[] = { 4, 1 };
        Task4 obj = new Task4();
        boolean result = obj.meth1(c, d);
        System.out.println(result);
    }
}