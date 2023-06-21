package j100_CodeChallange.Challange05;

public class Q02_ForLoop {
        //Interview Question
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {


        for (int i = 0; i <= 255; i++) {
            System.out.print("karakter: "+(char)i+ "\t "+"ascii degeri: "+i+ " ");
            System.out.println();
        }

    }

}
