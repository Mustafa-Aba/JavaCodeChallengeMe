package j100_CodeChallange.Challange08;

public class Task06 {
    public static void main(String[] args) {
        /* task->
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini print eden code create ediniz.

         */

        int arr1[][] = { {0,2,-1}, {3,8,9}, {7} };
        int arr2[][] = { {-7,6,-9}, {0,12}, {19} };

        System.out.println("toplam(arr1) = " + toplamMultiArray(arr1));
        System.out.println("toplam(arr2) = " + toplamMultiArray(arr2));

        System.out.println("toplam= " + toplamMultiArray(arr1) + toplamMultiArray(arr2));
    }
    public static int toplamMultiArray(int[][] array) {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                toplam += array[i][j];
            }
        }
        return toplam;
    }
}
