package j100_CodeChallange.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q17_SpecialCharRemoveArray {
    /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

    public static void main(String[] args) {
        ArrayList<String> money = new ArrayList<>(Arrays.asList( "$13", "$15", "$20"));

        System.out.println("getSum(money) = " + getSum(money));

    }

    private static int  getSum(ArrayList<String> money) {
        int sum=0;
        for (String w: money  ) {
            sum+=Integer.parseInt(w.replace("$", ""));
        }

        return (sum<0)? -1 : sum;
    }


}