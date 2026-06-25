package arrayBasic;

public class Example4 {
   static int countMaxones(int[] num) {
       int count = 0;
       int max = 0;
       for (int i = 0; i < num.length; i++) {
           if (num[i] == 1) {
               count++;
               max = Math.max(count, max);
           } else {
               count = 0;
           }
       }
           return max;

   }

    public static void main(String[] args) {

        int[] A = {1, 1, 0, 0, 1, 1, 1,0, 0};
        int countMax= countMaxones(A);
        System.out.println(countMax);
    }
}


