package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task01 {
    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String cumle = input.nextLine();

        System.out.println("xyzKontrol(cumle) = " + xyzKontrol(cumle));
        //System.out.println(xyzKontrol(cumle) ? "\"xyz\" dizimi içerir" : "\"xyz\" dizimi içermez");


    }

    private static boolean xyzKontrol(String str) {
        return str.contains("xyz");
    }
}
