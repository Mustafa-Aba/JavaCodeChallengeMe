package j100_CodeChallange.Challange07;

import java.util.Scanner;



public class Task02 {

		// task-> girilen tamsayının tek-çift olmasını kontrol eden method create ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi= input.nextInt();
        evenOrOdd(sayi);
        System.out.println(isOdd(sayi) ? "Tek sayı" : "Çift sayı");
        System.out.println(isEven(sayi) ? "Çift sayı" : "Tek sayı");
    }

    private static boolean isEven(int sayi) {
        return sayi % 2 == 0;
    }

    private static boolean isOdd(int sayi) {
        return sayi % 2 == 1;
    }

    public static void evenOrOdd(int sayi) {
        System.out.println(sayi % 2 == 0 ? "Sayi çift sayidir" : "Sayi tek sayidir.");
    }

}




