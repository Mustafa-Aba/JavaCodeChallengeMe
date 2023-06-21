// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
       // for (int i = 1; i <= 5; i++) {
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
           // System.out.println("i = " + i);
        //}

        int [][] arrMD={{1,2,3},{10,23},{103}};

        System.out.println("toplam(arrMD) = " + toplam(arrMD));
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        esle(arr);


    }
    public static int toplam(int[][] array) {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    toplam += array[i][j];
            }
        }
        return toplam;
    }
    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
     * yazdiran bir method yaziniz
     * int[] arr= {5,7,-6,4,2,15,3,8,1};
     * int istenenToplam=9;
     */


    public  static void esle(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==9) {
                    System.out.println("arr["+i+"]+arr["+j+"]= 9" );
                    System.out.println(arr[i]+" \t + \t "+arr[j]+" = 9");
                }
            }

        }

    }






}