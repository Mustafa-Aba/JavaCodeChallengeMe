package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task04 {

    /* Task->
     * Girilen  bir kelime 3 ve daha fazla harfden olusuyorsa son iki harfini 3 kere yan yana
     * degil ise girilen kelimeyi print eden code create ediniz.
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Kelime giriniz : ");
        String kelime1 = scan.nextLine();

        if (kelime1.length() >= 3) {
            String soniki=kelime1.substring(kelime1.length() - 2);
            System.out.println(soniki+soniki+soniki);
            for (int i = 0; i < 3; i++) {
                System.out.print(soniki);
            }
        } else
            System.out.println(kelime1);


    }
}
