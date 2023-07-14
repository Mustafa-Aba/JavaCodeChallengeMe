package j100_CodeChallange.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Q24_CountsOfRepeatingElement {
    /*  Task->
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
            Verilen arrayde istenen sayının tekrar saysını print eden code create ediniz.
     */

    public static void main(String[] args) {
        int[] numArray = {1, 2, 5, 1, 4, 7, 2, 3, 6, 4, 2};
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        countElements(numArray, sayi);
    }

    private static void countElements(int[] numArray, int n) {
        int count=0;
        for (int w : numArray) {
            if(n==w) count++;
        }
        System.out.println("count = " + count);
    }
}
