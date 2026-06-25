package arrayBasic;

import java.util.Arrays;

public class BubbleSort {

    static void BubbleSort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {12, 5, 8, 34, 5, 8, 2};

        BubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}



