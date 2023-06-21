package j100_CodeChallange.Challange06;

import java.util.Scanner;

public class Task07 {


    // Task-> Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Metin giriniz:  ");
        String metin = input.nextLine();
        int index = 0;
        while (metin.length() > index) {
            if (metin.charAt(index) != ' ' && metin.charAt(index) != 'a') {
                System.out.println(metin.charAt(index));
            }
            index++;
        }

    }

}
