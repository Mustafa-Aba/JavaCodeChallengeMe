package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task07 {

    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Metin giriniz : ");
        String str = scan.nextLine();

        System.out.println(str.contains("xyz"));

    }




}
