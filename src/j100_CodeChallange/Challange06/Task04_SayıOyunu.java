package j100_CodeChallange.Challange06;

import java.util.Scanner;

public class Task04_SayıOyunu {

    /*
    Task->
       Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, sayac=0,toplam=0;
        while (toplam<=100) {
            System.out.println("Toplamak istediğiniz sayıyı giriniz: ");
            sayi = input.nextInt();
            toplam+=sayi;
            System.out.println("Girdiğin sayıların toplamı = " + toplam);
            sayac++;
        }
        System.out.println(sayac+ " kere sayi girdin. Bu kadar sayi yeter" );



    }

}
