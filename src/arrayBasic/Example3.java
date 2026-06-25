package arrayBasic;

public class Example3 {
    static int secondlargest(int[] num) {
        int first = num[0];
        int second = -1;
        for (int i = 1; i < num.length; i++) {
            if (first < num[i]) {
                second = first;
                first = num[i];
            } else if (second < num[i] && first != num[i]) {
                second = num[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] A = {8, 8, 7, 6, 5};
        int second = secondlargest(A);
        System.out.println(second);
    }
}

