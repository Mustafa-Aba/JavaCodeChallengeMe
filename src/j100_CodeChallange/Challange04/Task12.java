package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task12 {
    // Task-> Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Task-> Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Metin giriniz : ");
        String str = scan.nextLine();

        System.out.println(str.contains(" ") ? "boşluk içerir" : "boşluk içermez");
        System.out.println(str.isEmpty() ? "boş":"boş değil");

    }
}