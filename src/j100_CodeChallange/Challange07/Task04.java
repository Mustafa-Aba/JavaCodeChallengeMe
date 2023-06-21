package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task04 {


    /* task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz: ");
        int sayi = input.nextInt();
        isaret(sayi);
        Task02.evenOrOdd(sayi);
        System.out.println((sayi >= 100 && sayi <= 999) ? "Sayının rakamlar toplamı= " + rakamlarTopla(sayi) : "Sayının birler basamağı= " + birler(sayi));

    }
    private static int birler(int sayi) {
        return sayi % 10;
    }

    private static int rakamlarTopla(int sayi) {

        int toplam = 0;
        while (sayi > 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }
        return toplam;
    }


    private static void isaret(int sayi) {
        if (sayi > 0) {
            System.out.println("Sayı pozitiftir");
        } else if (sayi<0) {
            System.out.println("Sayı negatiftir");
        } else
            System.out.println("sayı sıfıra eşittir");
    }
}