package arrayBasic;

public class Example6 {
    // leedcode 896
    //MonotonicArray
    public static boolean isMonotonic(int[] nums) {

        boolean isMonotonicIncreasing = true;
        boolean isMonotonicDecreasing = true;

        int j;
        for (int i = 0; i < nums.length - 1; i++) {
            j = i + 1;
            if (!(i <= j && nums[i] <= nums[j])) {
                isMonotonicIncreasing = false;
                break;
            }

        }
        for (int i = 0; i < nums.length - 1; i++) {
            j = i + 1;
            if (!(i <= j && nums[i] >= nums[j])) {
                isMonotonicDecreasing = false;
                break;
            }
        }
        return isMonotonicDecreasing || isMonotonicIncreasing;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        System.out.println(isMonotonic(A));
        int[] B= {9, 8, 7, 6, 5};
        System.out.println(isMonotonic(B));
    }
}
