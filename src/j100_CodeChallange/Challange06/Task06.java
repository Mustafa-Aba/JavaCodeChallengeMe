package j100_CodeChallange.Challange06;

import java.util.Scanner;

public class Task06 {

    /*Task->
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise  print eden code create ediniz
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch ;
        do {
            System.out.print("Karakter giriniz:  ");
            ch = input.next().charAt(0);
            if (ch == 'x') {
                System.out.println("Program bitti");
                continue;
            }
            System.out.println("Program calısıyor");

        }while (ch != 'x');


    }
}
