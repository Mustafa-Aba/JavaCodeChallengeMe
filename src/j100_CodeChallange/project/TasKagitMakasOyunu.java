package j100_CodeChallange.project;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasOyunu {
    /*
Taş kağıt makas oyunu....
Bilgisayardan rastle(random class kullanılarak) 1-2-3 1=TAŞ, 2=KAĞIT, 3=MAKAS arasında bir sayı alıp kullanıcının
seçimini  kullanarak 3 puan alanın kazanan oldugu code create ediniz .
*/


    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    static int pcSecim, gamer, gamerPuan = 0, pcPuan = 0;

    public static void main(String[] args) {

        oyunTasKagitMakas();
    }

    private static void oyunTasKagitMakas() {

        while ((gamerPuan != 3 && pcPuan != 3)) {
            pcSecim = random.nextInt(3) + 1;//1 dahil, 3 dahil
            //System.out.println("pcSecim = " + pcSecim);
            gamerSecim();
            if ((gamer == 1 && pcSecim == 3) || (gamer == 2 && pcSecim == 1) || (gamer == 3 && pcSecim == 2)) {
                gamerPuan++;
            } else if ((gamer == 3 && pcSecim == 1) || (gamer == 1 && pcSecim == 2) || (gamer == 2 && pcSecim == 3)) {
                pcPuan++;
            }
        }
        sonuc();
    }

    private static void gamerSecim() {
        System.out.print("***Oyuncu İşlem Seciniz:***\n\tTas :\t '1'\n\tKagıt:\t '2'\n\tMakas:\t '3'\nsecim: ");
        gamer = input.nextInt();
        if (!(gamer>=1&&gamer<=3)) {
            System.out.println("Yanlış giriş yaptınız :( Tekrar deneyin. ");
            gamerSecim();
        }
    }

    private static void sonuc() {
        if (gamerPuan == 3) {
            System.out.println("Oyuncu kazandı.Tebrikler");
        } else
            System.out.println("PC kazandı.Üzgünüm");
    }

}

