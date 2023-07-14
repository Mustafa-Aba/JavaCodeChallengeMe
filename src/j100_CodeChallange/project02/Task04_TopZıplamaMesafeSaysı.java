package j100_CodeChallange.project02;

import java.util.Scanner;

public class Task04_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {


//        Scanner scan = new Scanner(System.in);
//        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
//        double yukseklik = scan.nextDouble();
//        double topunToplamYolu=0;
//        int yereVurmaSayisi=0;

        mySolution();
        mySolution2();

    }

    private static void mySolution2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
        double ilkyukseklik = scan.nextDouble();

        double topunToplamYolu=ilkyukseklik;
        int yereVurmaSayisi=0;
        double yukseklik=ilkyukseklik;

        for (int i = 1; yukseklik > 1; i++) {
            topunToplamYolu+=ilkyukseklik*(2*Math.pow(0.75,i));
            yukseklik*=0.75;
            yereVurmaSayisi++;
        }
        System.out.println("yereVurmaSayisi = " + yereVurmaSayisi);
        System.out.println("topunToplamYolu = " + topunToplamYolu);
        System.out.println(2+2*1.5+2*9.0/8+2*27.0/32);
    }

    private static void mySolution() {
        Scanner input = new Scanner(System.in);
        System.out.print("topun yüksekliğini giriniz: ");
        double height = input.nextDouble();
        double toplam = height;
        int sayac = 0;

        while (height >= 1) {
            height *= (0.75);
            toplam += 2 * height;
            sayac++;
        }
        System.out.println("height = " + height);
        System.out.println("Topun yere vurma sayısı = " + sayac);
        System.out.println("Topun aldığı toplam yol  = " + toplam);
    }
}
