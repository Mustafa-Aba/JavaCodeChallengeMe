package j100_CodeChallange.project02;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		 Task-> girilen sayıya kadar  tüm sayıların toplamını print eden METHOD create ediniz.
          Ornegin; 5, 4, 7, 0 ise 5+4+7=16

		  */
        sayilarinToplami();
    }

    private static void sayilarinToplami() {

        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;
        System.out.println("Toplamak istediğiniz sayıları giriniz. Çıkmak için '0' giriniz.");
        do {
            System.out.print("Bir sayi giriniz: ");
            sayi = input.nextInt();
            toplam += sayi;
        } while (sayi != 0);
        System.out.println("toplam = " + toplam);
    }

}
