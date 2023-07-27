package j100_CodeChallange.InterviewQuestions.ObebOkek;

public class Hesapla {


    public static int obeb(ObebOkek eleman) {
        int obeb = 1;
        int ks = Math.min(eleman.getS1(), eleman.getS2());
        for (int i = ks; i > 1; i--) {
            if (eleman.getS1() % i == 0 && eleman.getS2() % i == 0) {
                obeb = i;
                break;
            }
        }
        return obeb;
    }
    //1. yol

    public static int okek1(ObebOkek eleman) {
        int okek= 1;

        int buyukSayi = Math.max(eleman.getS1(), eleman.getS2());
        while (true) {
            if (buyukSayi % eleman.getS1() == 0 && buyukSayi % eleman.getS2() == 0) {
                okek = buyukSayi;
                break;
            }
            buyukSayi++;
        }
        return okek;

    }
        //2.yol
    public static int okek2(ObebOkek eleman) {
        int okek = eleman.getS1()*eleman.getS2()/obeb(eleman);
        return okek;

    }
    //3.yol hatalı tekrar bak

    public static int okek3(ObebOkek eleman) {
        int okek = 1;
        if (obeb(eleman)==1) {
        okek=eleman.getS1()*eleman.getS2();
        }
        for (int i = obeb(eleman); i >= 1; i--) {

            if (eleman.getS1() % i == 0 && eleman.getS2() % i == 0) {
                okek*=i;
                eleman.setS1(eleman.getS1()/i);
                eleman.setS2(eleman.getS2()/i);
            }else if (eleman.getS1() % i == 0 ) {
                okek*=i;
                eleman.setS1(eleman.getS1()/i);
            }else if (eleman.getS2() % i == 0) {
                okek*=i;
                eleman.setS2(eleman.getS2()/i);
            }
        }

        return okek;

    }
}
