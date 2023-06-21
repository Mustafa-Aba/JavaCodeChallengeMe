package j100_CodeChallange.Challange05;

public class Q03_ForLoop {

    //Convert "Java" to "J*a*v*a*"

	/*	ForLoop
		print even numbers from 100 to 0 but do not use decrement(i--).

		     INPUT      :
		     OUTPUT  : 100 98 96 94 92 ....2 0
      */

    public static void main(String[] args) {
        String str= " ";
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0) {
                str=i+" "+str;
            }
        }System.out.print(str+" ");
    }
}
