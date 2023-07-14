package j100_CodeChallange.project02;

import java.util.Arrays;

public class Task05_EksikArrayEleman {
    /*
    Task-> 1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı return eden  metod create ediniz..

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int[] arr1 = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int[] arr2 = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        int[] arr3 = {7, 5, 10, 2, 4, 6, 8, 3, 9};

        eksikSayiyiBul(arr);
        eksikSayiyiBul(arr1);
        eksikSayiyiBul(arr2);
        eksikSayiyiBul(arr3);

//        System.out.println("eksikSayiyiBul2(arr) = " + eksikSayiyiBul2(arr));
//        System.out.println("eksikSayiyiBul2(arr) = " + eksikSayiyiBul2(arr1));
//        System.out.println("eksikSayiyiBul2(arr) = " + eksikSayiyiBul2(arr2));
//        System.out.println("eksikSayiyiBul2(arr) = " + eksikSayiyiBul2(arr3));

    }

    private static void eksikSayiyiBul(int... arr) {
        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != (i + 1)) {
//                System.out.println("eksik sayi: " + (i + 1));
//                break;
//            }
//            if (arr[arr.length - 1] != 10) {
//                System.out.println("eksik sayi: " + 10);
//                break;
//            }
//        }
        //baska bir yol

        for (int i = 0; i < arr.length; i++) {

                if (arr[i]-arr[i+1]==2) {
                    System.out.println("eksik sayi: " + (i + 1));
                    break;
                }

        }
    }

    private static int eksikSayiyiBul2(int[] arr) {
        int[] arrFull = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int toplam = 0;
        int toplamEksik = 0;
        for (int w : arrFull) {
            toplam += w;
        }
        for (int w : arr) {
            toplamEksik += w;
        }
        return (toplam - toplamEksik);

    }
}



