package practice02;

import java.util.Arrays;

public class S05_Array_IsaretDegistir {
    public static void main(String[] args) {
         /*
        Array içerisindeki elementlerin işaretlerini (+-) değiştiren bir kod yazınız.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
    */
        int arr[] = {1,2,-3,4,-5,-6};
        int arrNew[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                arrNew[i] = arr[i] * -1;
                //arr[i] *= -1;
            }
            System.out.println(Arrays.toString(arrNew));
        }
    }
}
