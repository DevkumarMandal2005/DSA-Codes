package arrayBasic;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 6, 5};
        int[] reverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }

        System.out.print("Reversed Array: " +Arrays.toString(reverse));

    }
}

