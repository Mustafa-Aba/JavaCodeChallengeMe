package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task05 {

    /* Task->
     * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("4 Kelime giriniz : ");
        String k1= scan.next();
        String k2= scan.next();
        String k3= scan.next();
        String k4= scan.next();

        System.out.println(k1.toUpperCase().charAt(0)+k1.substring(1) + " " + k2 + " " + k3 + " " + k4 + ".");

    }

}
