package j100_CodeChallange.Challange06;

import java.util.Scanner;

public class Task03_TekSayıAdedi {

    /* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        int i=1;
        while(i<sayi){
            i++;
            System.out.print(i%2==1?i+ " ":"");
        }


    }

}
