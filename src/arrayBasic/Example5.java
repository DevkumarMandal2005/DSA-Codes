package arrayBasic;

public class Example5 {
    static void movesZerosToEnd(int[] num) {
        int j = 0;
        int temp;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                temp = num[j];
                num[j] = num[i];
                num[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        movesZerosToEnd(num);


        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
