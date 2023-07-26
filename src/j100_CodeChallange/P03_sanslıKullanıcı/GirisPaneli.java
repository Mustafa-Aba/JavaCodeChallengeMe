package j100_CodeChallange.P03_sanslıKullanıcı;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {



   // public static void giris(){// bu tanımlama ile method static oldg için className ile call edilir
    public  void giris(){// bu tanımlama ile method non static oldg için obj ile call edilir
        Scanner sc = new Scanner(System.in);

        Kayit yeniKayit = new Kayit();//Kayıt Class'a erişim için p'siz cons. ile  yeniKayıt obj uretildi

        //Kayıt Class'dan obj olmadan method call etmek için method'lar static yapılırsa ClassName ile call edilebilir
        ArrayList<Kullanici> kisi = new ArrayList<>();//Kulllanıcı Class'dan uretilen obj tutulacagi bos list

        boolean cikilsinMI = true;//while döngü için sart tanımlandı
        while (cikilsinMI) {
            System.out.println("agam ne istirsen\n1->Kullanıcı Kayıt Al\n2->sansli Kişi Bul\n3->Listele\n4->Ckıs\nseçermisin : ");
            int tercih = sc.nextInt();
            switch (tercih) {
                case 1:
                    kisi= yeniKayit.kayitAl();//Kayıt Class'dan yeniKayıt obj kayıtAl() method call edildi
                    break;

                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;

                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMI=false;
                    break;
                default:
                    System.out.println("agan adam gibi bişeyler giresen :( ");
                    break;
            }
        }


    }
}
