package j100_CodeChallange.Challange06;

import java.util.Scanner;

public class Task09_HarfSay {
    /* Task->
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String cumle = input.nextLine();
        System.out.print("Hangi harfi istersiniz: ");
        char harf = input.next().charAt(0);
        int i = 0, sayac = 0;

        while (cumle.length() > i) {
            if (cumle.charAt(i)== harf) {
                sayac++;
            }
            i++;
        }
        System.out.println("Girdiginiz cumlede \"" + harf + "\" harfi " + sayac + " kere kullanilmis.");


    }


}
