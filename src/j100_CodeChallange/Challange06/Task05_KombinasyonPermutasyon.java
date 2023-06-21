package j100_CodeChallange.Challange06;

import java.util.Scanner;

public class Task05_KombinasyonPermutasyon {

    /*  Problem Tanımı
  Verilen iki sayının kombinasyonunu bulan kodu yazınız.
  Hatırlatma C(n,r) = n! / (r!(n-r)!)

  Verilen iki sayının permütasyonunu bulan kodu yazınız.
  Hatırlatma P(n,r) = n! / (n-r)!

  Ekran Çıktısı
  Birinci sayıyı giriniz: 15
  Ikinci sayıyı giriniz: 4
  Kombinasyon: 1365
  permütasyon: 32760

  Birinci sayıyı giriniz: 5
  Ikinci sayıyı giriniz: 3
  Kombinasyon: 10
  permütasyon: 60
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("Ikinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        System.out.println("faktoriyel(sayi1) = " + faktoriyel(sayi1));
        System.out.println("faktoriyel(sayi2) = " + faktoriyel(sayi2));

        kombinasyon(sayi1,sayi2);
        permutasyon(sayi1,sayi2);

    }

    private static void kombinasyon(int n, int r) {
        //C(n,r) = n! / (r!(n-r)!)

        System.out.println("Kombinasyon= "+(faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r))));
    }
    private static void permutasyon(int n, int r) {
        //P(n,r) = n! / (n-r)!
        System.out.println("Permutasyon= "+(faktoriyel(n) / (faktoriyel(n - r))));
    }

    private static int faktoriyel(int n) {
        int faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }

}