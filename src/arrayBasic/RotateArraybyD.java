package arrayBasic;
import java.util.Arrays;
public class RotateArraybyD{
        static void RotateArraybyD(int[] arr, int d) {

            int n = arr.length;
            d = d % n;

            int[] temp = new int[n];

            for (int i = 0; i < n; i++) {
                temp[i] = arr[(i + d) % n];
            }

            for (int i = 0; i < n; i++) {
                arr[i] = temp[i];
            }
        }

        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 5, 6};
            int d = 2;

            RotateArraybyD(arr, d);
            System.out.println(" " + Arrays.toString(arr));


        }
    }
