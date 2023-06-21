package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task07 {

    /* task ->
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        System.out.println(esitMi(sayi1, sayi2) ? "Sayılar birbirine esit" : "Sayılar birbirine esit degil");


    }//main sonu

    private static boolean esitMi(int x, int y) {
        return (x == y);
    }


}





