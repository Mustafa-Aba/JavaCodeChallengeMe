package j100_CodeChallange.Challange05;

import java.util.Scanner;

public class Q05_NestedForLoop {
    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("input the number of rows: ");
        int rows = input.nextInt();
        System.out.print("input the number of column: ");
        int column = input.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
