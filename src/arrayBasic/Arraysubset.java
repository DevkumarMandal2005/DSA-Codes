package arrayBasic;

public class Arraysubset {

    public static boolean Arraysubset(int [] a, int [] b){

        for(int i=0;i<b.length;i++){
            boolean found = false;

            for(int j=0; j<a.length;j++){
                if(b[i]==a[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {15, 3, 7, 1,};

        if (Arraysubset(a, b)) {
            System.out.println("true");
        }else{
                System.out.println("false");
            }
        }

    }