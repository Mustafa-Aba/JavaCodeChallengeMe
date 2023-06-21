package j100_CodeChallange.Challange06;

import java.util.Scanner;

public class Task02_CarpımTablosu {
    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10
    // Task-> Yukarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");

        int sayi= input.nextInt();
        int i=1;
        while (i<=10) {
            System.out.println(sayi+ " x "+i +" = "+(sayi*i));
            i++;
        }

       //for (int i = 1; i <= 10; i++) {
       //    for (int j = 1; j <= 10; j++) {
       //        System.out.println(i + " x " + j + " = " +i*j);
       //    }
       //    System.out.println();
       //}



    }
}


