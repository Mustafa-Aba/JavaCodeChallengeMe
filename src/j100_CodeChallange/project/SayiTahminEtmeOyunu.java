package j100_CodeChallange.project;

import java.util.Random;
import java.util.Scanner;

/*
Sayı tahmin etme oyunu....
Bilgisayardan rastle(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan code create ediniz .
*/
public class SayiTahminEtmeOyunu {
    static Scanner input=new Scanner(System.in);
    static int tahmin,rastgele,count;

    public static void main(String[] args) {
        Random random=new Random();
        rastgele=random.nextInt(100);//0 dahil, 100 dahil değil
        tahminEt();
        System.out.println("rastgele = " + rastgele);

    }

    private static void yonlendir() {

        if (rastgele<tahmin) {
            System.out.println("Daha küçük bir sayı giriniz");
            tahminEt();
        } else if (rastgele > tahmin) {
            System.out.println("Daha büyük bir sayı giriniz");
            tahminEt();
        }else
           bitir();

    }

    private static void bitir() {
        System.out.println("Sayıyı "+count+". tahminde buldunuz. Tebrikler.");
    }

    private static void tahminEt() {
        System.out.print("0- 100 arasında bir sayı tahmin ediniz:  ");
        tahmin= input.nextInt();
        count++;
        yonlendir();

    }
}

