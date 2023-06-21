package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task03 {
    /* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("cm ölçüsünü giriniz: ");
        int cm=input.nextInt();
        double metre=cmToMetre(cm);
        double km=metre/1000;

        System.out.println(cm+" cm = " + metre+" m");
        System.out.println(cm+" cm = " + km+" km");

    }

    private static double cmToMetre(int cm) {
        return cm*0.01;

    }

}