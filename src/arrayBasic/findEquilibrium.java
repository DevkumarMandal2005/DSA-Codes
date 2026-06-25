package arrayBasic;

public class findEquilibrium {
    static int findEquilibrium(int[] arr) {

        // Check for indexes one by one until
        // an equilibrium index is found
        for (int i = 0; i < arr.length; ++i) {
            // Get left sum
            int leftSum = 0;
            for (int j = 0; j < i; j++)
                leftSum += arr[j];

            // Get right sum
            int rightSum = 0;
            for (int j = i + 1; j < arr.length; j++)
                rightSum += arr[j];

            // Check the condition
            if (leftSum == rightSum)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,3};
        System.out.println(findEquilibrium(arr));
    }
}

