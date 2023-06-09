package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task02 {
    //Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("1. Kelime giriniz : ");
        String kelime1= scan.nextLine();

        System.out.print("2. Kelime giriniz : ");
        String kelime2= scan.nextLine();

        System.out.println(kelime1.concat(kelime2));
        System.out.println(kelime1+kelime2);

        System.out.println(kelime1.substring(1).concat(kelime2.substring(1)));

    }

}
