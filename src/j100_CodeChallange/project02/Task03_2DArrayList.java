package j100_CodeChallange.project02;
import java.util.ArrayList;
import java.util.List;

public class Task03_2DArrayList {

    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */

    public static void main(String[] args) {

        List<List<String>> multiArrayList = new ArrayList<>();

        // 2D ArrayList'i oluşturma
        List<String> calisanlar = new ArrayList<>();
        calisanlar.add("calisan1");
        calisanlar.add("calisan2");
        calisanlar.add("calisan3");

        multiArrayList.add(calisanlar);

        List<String> isverenler = new ArrayList<>();
        isverenler.add("isveren1");
        isverenler.add("isveren2");
        isverenler.add("isveren3");

        multiArrayList.add(isverenler);

        List<String> sirketler = new ArrayList<>();
        sirketler.add("sirket1");
        sirketler.add("sirket2");
        sirketler.add("sirket3");

        multiArrayList.add(sirketler);


        // 2D ArrayList'i yazdırma
        System.out.println("multiArrayList = " + multiArrayList);
        for (List<String> row : multiArrayList) {
            for (String str : row) {
                System.out.print(str + " ");
            }
            System.out.println();

        }
    }
}

