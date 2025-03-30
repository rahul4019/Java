import java.util.*;

public class ArrList {
    public static void main(String[] args) {

        // arraylist is a dyamic array (can grow or shrink its size)
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        // int[] arr1 = { 1, 2, 3 };
        char[] arr1 = { 'a', 'b', 'c' };

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}