package arrayBasic;

public class Example1 {
    int linearSearch(int[]num, int target) {    //Here if we mark this statement with static key word then we not crate a object
        int index = -1;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                index = i;
                break;

            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr ={2,3,4,5,3};
        int key =3;

        Example1 instance = new Example1(); //here we create a  object
        int index = instance.linearSearch(arr,key);

                if(index>=0)
                {
                    System.out.println(key+"...found at"+index);
                }
                else{
                    System.out.println(key+"... not found ");
                }
                }

    }

