package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task11 {
    // Task-> Girilen  isim ve soyismini  hangisinin daha uzun oldugunu print eden code create ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("isim giriniz : ");
        String name1 = scan.nextLine();
        System.out.print("soyisim giriniz : ");
        String name2 = scan.nextLine();

        System.out.println(name1.length() == name2.length()?"uzunluklar eşit":name1.length() > name2.length() ? "isim daha uzun" : "soyisim daha uzun");

    }

}