package j100_CodeChallange.InterviewQuestions;

public class Q18_MultipleMethodVarargs {
    /* Task->
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	print eden  parametreli method create ediniz.
 */
    public static void main(String[] args) {


        System.out.println("ort(ogrenciNot) = " + ort(6, 4, 3, 5, 4));


    }

    private static double ort(int... not) {
        double toplam = 0;
        for (int w : not) {
            toplam += w;
        }
        return toplam / not.length;
    }


}
