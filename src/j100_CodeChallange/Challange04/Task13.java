package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task13 {
    //Task-> Girilen   4 harfli bir kelimeyi tersten print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("4 harfli bir kelime giriniz: ");
        String metin = input.nextLine();

        String tersstr = "" + metin.charAt(metin.length() - 1) + metin.charAt(metin.length() - 2) + metin.charAt(metin.length() - 3)
                + metin.charAt(0);
        System.out.println("tersstr = " + tersstr);


        // for dongusu ile
        for (int i = 0; i < metin.length(); i++) {
            tersstr = metin.charAt(i) + tersstr;
        }
        System.out.println(tersstr);


    }

}

