package j100_CodeChallange.Challange08;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
		/* task->
        verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int arr[] = {2,6,4,5,8,9};
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)Math.pow(arr[i],2);
        }
        System.out.println("arr = " + Arrays.toString(arr));

    }
}
