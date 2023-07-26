package j100_CodeChallange.InterviewQuestions;

import java.util.Scanner;

public class Q30_ExponentialNumber {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            int zar1=(int)(Math.random()*6+1);
            int zar2=(int)(Math.random()*6+1);

            System.out.println("zar1 = " + zar1);
            System.out.println("zar2 = " + zar2);
            if ((zar1+zar2)==9) {
                System.out.println("KAzandınız");
            }else
                System.out.println("Olmadı tekrar dene");

        }

    }


}
