package j100_CodeChallange.InterviewQuestions.ObebOkek;

public class ObebOkek { //pojo class-> obj create eden kalıphane
    // 1. step private field
   private int s1;
   private int s2;
 // 2. step getter-setter
    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    // 3. step p'li cons
    public ObebOkek(int s1, int s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    // 4. step toString

    @Override
    public String toString() {
        return
                "s1=" + s1 +
                ", s2=" + s2
               ;
    }
}
