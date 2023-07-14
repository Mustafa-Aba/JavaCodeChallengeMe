package j100_CodeChallange.InterviewQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q21_CountFactors {
    /* Task->
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Girilen sayının tam bolen sayısını print eden code create ediniz.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        System.out.println(sayi + "sayısnın bölenleri = " + factors(sayi));

    }

    private static ArrayList<Integer> factors(int sayi) {
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                answer.add(i);
                count++;
            }
        }
        System.out.println("Toplan bölen sayısı = " + count);
        return answer;
    }
}
