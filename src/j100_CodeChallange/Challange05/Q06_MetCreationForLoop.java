package j100_CodeChallange.Challange05;

import java.util.Scanner;

public class Q06_MetCreationForLoop {
    /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = input.nextLine();
        String tersstr="";
        for (int i = 0; i < metin.length(); i++) {
            tersstr=metin.charAt(i)+tersstr;
        }
        System.out.println(tersstr);

        reverseString(metin);

    }
    public static void reverseString(String metin) {
        String tersstr="";
        for (int i = metin.length()-1; i >= 0; i--) {
            tersstr+=metin.charAt(i);
        }
        System.out.println(tersstr);
    }

}
