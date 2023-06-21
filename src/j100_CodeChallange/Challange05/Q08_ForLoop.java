package j100_CodeChallange.Challange05;

import java.util.Scanner;

public class Q08_ForLoop {

    // Kullanicidan iki sayi isteyin.
    // Girilen sayilar ve aralarindaki tum
    // tamsayilari toplayip, sonucu yazdiran bir program yaziniz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("Ikinci sayı giriniz: ");
        int sayi2 = input.nextInt();
        int toplam=0;
        for (int i = Math.min(sayi1,sayi2); i <= Math.max(sayi1,sayi2); i++) {
            toplam+=i;
        }
        System.out.print("toplam = " + toplam);
    }




}
