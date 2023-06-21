package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task05 {
    static Scanner input = new Scanner(System.in);
    static int adet;
    static Scanner sc = new Scanner(System.in);
    // task->
    //Kullaniciya kac sayi toplamak istedigini sorun.
    //Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
    //Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
    //2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz

    public static void main(String[] args) {
        getUser();
        if (adet>4) {
            System.out.println("cok sayi girdiniz, ben toplayamam");
        } else if (adet<2) {
            System.out.println("En az 2 sayi girmelisiniz");
        }else
            System.out.println("Sayıların toplamı= " +toplaSayi(adet));
    }
    private static int toplaSayi(int n) {
        int toplam=0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+ " . sayıyı giriniz: ");
            toplam+= input.nextInt();
        }
        return toplam;
    }

    private static void getUser() {
        System.out.print("Kaç adet sayıyı toplamak istersiniz: ");
        adet = input.nextInt();
    }

}
