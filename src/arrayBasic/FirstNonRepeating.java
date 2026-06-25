package arrayBasic;

public class FirstNonRepeating {

      public static int firstNonRepeating(int[] arr) {

            for (int i = 0; i < arr.length; i++) {
                int count = 0;

                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count == 1) {
                    return arr[i];
                }
            }

            return 0;
        }

        public static void main(String[] args) {
            int[] arr = {1,5,8,5,1,4,8};

            System.out.println(firstNonRepeating(arr));
        }
    }

