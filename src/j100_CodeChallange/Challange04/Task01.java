package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task01 {

    //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("isim soy isim giriniz: ");
        //String isim= scan.next();
        //String soyisim= scan.nextLine();

        System.out.println(scan.next().toUpperCase() + " " + scan.nextLine().toUpperCase());

    }

}
