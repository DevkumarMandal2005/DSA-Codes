package arrayBasic;

import javax.imageio.stream.ImageInputStream;
public class Example2 {
    static int findlargest(int[] num) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;

    }
    static int findsmallest(int[] num) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] A = {3, 3, 0, 99, -40};

        int largest = findlargest(A);
        int smallest = findsmallest(A);

        System.out.println(largest);
        System.out.println(smallest);

    }
}

