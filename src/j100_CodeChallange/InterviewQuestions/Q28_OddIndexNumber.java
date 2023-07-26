package j100_CodeChallange.InterviewQuestions;

import java.util.Scanner;

public class Q28_OddIndexNumber {
    // Task-> girilen str'deki indexi tek olan karakterleri print eden code create ediniz.

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bir ifade giriniz");
        String str = input.next();
        int i = 1;
        do {
            System.out.print(str.charAt(i));
            i+=2;
        }while(i < str.length());
    }
}
