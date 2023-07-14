package j100_CodeChallange.project02;

import java.util.Scanner;

public class Task01_IkininKuvvetiKontrol {
    public static void main(String[] args) {
        /* Task
        Girilen sayının 2'nin kuvveti olmasının kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("pozitif tam sayi giriniz");
        int sayi = input.nextInt();
        System.out.println(PowersofTwo( sayi) ? "Sayınız 2'nin kuvvetidir. " : "Sayınız 2'nin kuvveti DEGİLDİR");

    }

    private static boolean PowersofTwo(int num) {
        boolean result = false;

//        for (int i = 1; i <= num; i *= 2) {
//            if (num == i) {
//                result = true;
//                break;
//            }
//        }
//        return result;
        // for (int i = 0; i < Math.sqrt(num)+1; i++) {
        //     if (num==Math.pow(2,i)) {
        //         result=true;
        //         break;
        //     }
        // }
        // return result;

        if (num > 1) {
            num = (int) Math.sqrt(num);
            if (num == 2) {
                result = true;
            } else {
                PowersofTwo(num);
            }
        }
        return result;
    }
}

