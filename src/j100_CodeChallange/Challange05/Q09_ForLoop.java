package j100_CodeChallange.Challange05;

public class Q09_ForLoop {

    //Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

    public static void main(String[] args) {

        for (int i = 11; i <= 120; i++) {
            System.out.print(i%4==0&&i%6==0?i+" ":"");
        }

    }

}
