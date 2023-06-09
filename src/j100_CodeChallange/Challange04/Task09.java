package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task09 {
    /* Task->
        Girilen bir kelimede  tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri print eden code create ediniz.
      */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Metin giriniz : ");
        String str=scan.next();

        if (str.length()%2==1 && str.length()>=3) {
            System.out.println("orta karakter: "+str.charAt(str.length() / 2));
        }


    }
}
