package TaskCozum.task10Methots;

import java.util.Scanner;

public class Task02 {
    static String ad,soyAd;
    public static void main(String[] args) {
        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("AGAM adını   giresin  : ");
        ad = input.nextLine();

        System.out.print("AGAM soyadını giresin : ");
        soyAd = input.nextLine();
        isimYaz();



    }//main sonu
// ali taş
    private static void isimYaz() {

        ad = ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyAd = soyAd.substring(0,1).toUpperCase()+soyAd.substring(1).toLowerCase();
        System.out.println(ad+" "+soyAd);
    }


}
