package j100_CodeChallange.InterviewQuestions;

import java.util.Scanner;

public class Q22_PrintVowelsOfString {
    // Task->
    // Get String from user and print just vowels(aeiou) inside String on the console
    // Girilen bir ifadenin sadece sesli harflerin print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir ifade giriniz: ");
        String str = input.nextLine();

        vowels(str);


    }

    private static void vowels(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++) {
            for (char w : vowels) {
                if (str.charAt(i) == w) {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }

}
