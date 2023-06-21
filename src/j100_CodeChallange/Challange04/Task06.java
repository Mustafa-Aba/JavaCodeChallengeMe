package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task06 {
    /*  Tsk->
        girilen  Stringin ilk iki karakteri haric string return eden code create ediniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Metin giriniz : ");
        String str = scan.next();


        if (str.startsWith("gh")) {
            str = "gh" + str.substring(2);
        } else if (str.startsWith("g")) {
            str = "g" + str.substring(2);
        } else if (str.charAt(1) == 'h') {
            str = "h" + str.substring(2);
        } else
            str = str.substring(2);
        System.out.println(str);


    }
}