package j100_CodeChallange.InterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /* Task->
      Girilen bir String'de var olan her character'in sayisini print eden code create ediniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String str = input.nextLine();

        String[] arr = str.split("");
        String[] newArr = new String[arr.length];

        String ch;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            ch = str.substring(i, i + 1);

            if (str.substring(str.indexOf(ch) + 1).contains(ch)) {

                count++;
                System.out.println("ch = " + ch);
                System.out.println("count = " + count);
                count=0;

            }else {
                System.out.println("ch = " + ch);
                System.out.println("count = " + (count+1));

            }

        }

    }


}


