package j100_CodeChallange.Challange07;


import java.util.Scanner;

public class Task06 {

    /* task->
     Girilen  isim ve soyismin ilk harflerini büyük
     diğer harflerini küçük harf olarak print eden method create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir isim giriniz: ");
        String ad=input.nextLine().toLowerCase();
        System.out.print("Bir soyisim giriniz: ");
        String soyad=input.nextLine().toLowerCase();

        isimYaz(ad,soyad);
    }
    public static void isimYaz(String str1,String str2) {

        System.out.println(str1.substring(0, 1).toUpperCase().concat(str1.substring(1)).concat(" " + str2.substring(0, 1).toUpperCase().concat(str2.substring(1))));
    }


}
