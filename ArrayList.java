import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add elements
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        System.out.println(list);
        // get elements
        int element = list.get(3);
        System.out.println(element);
        list.add(1, 2);
        System.out.println(list);
        list.set(0, 8);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}