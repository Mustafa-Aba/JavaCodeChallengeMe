package j100_CodeChallange.Challange05;

public class Q07_Forloop {

    /*
     Interview Question
     1'den 100'e kadar olan sayilari yazdiriniz..
     Ancak kodunuzda herhangi bir sayi kullanmayiniz!
     */
    public static void main(String[] args) {

        char rakam = '0';
        char onlar = '0';
        for (int i = 0; i <10; i++) {

            for (int j = 0; j < 10; j++) {
                if (i ==0&&j==0) {
                    continue;
                }
                System.out.print(i!=0?(char) (onlar + i):"");
                System.out.print((char) (rakam + j) + " ");

            }

        }
    }
}
