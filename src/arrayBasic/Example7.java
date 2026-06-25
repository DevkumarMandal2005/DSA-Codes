package arrayBasic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example7 {


    int partition(int A[], int l, int h)
    {
        int pivot=A[l];
        int i=l;
        int j=h;

        do
        {
            do
            {
                i++;
            }while (i< h && A[i] <= pivot);

            do
            {
                j--;
            } while (A[j] > pivot);

            if (i < j)
            {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }

        }while (i < j);

        int temp = A[l];
        A[l] = A[j];
        A[j] = temp;

        return j;

    }

    void QuickSort(int[] A, int l, int h)
    {

        if(l < h)
        {
            int j = partition(A,l,h);
            QuickSort(A,l,j);
            QuickSort(A,j+1,h);
        }
    }

    public static void main(String[] args) {
        Example7 instance = new Example7();
        int[] nums = {11,13,7,12,16,9,24,5};

        instance.QuickSort(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));
    }

}
