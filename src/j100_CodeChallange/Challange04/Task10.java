package j100_CodeChallange.Challange04;

public class Task10 {


    // Task-> "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde print eden code create ediniz.

    public static void main(String[] args) {
        String str = "Java ogrenmek123 Cok guzel@ ";
        String strsonuc = "";

       //str=str.replaceAll("\\s","");
       //System.out.print(str + " ");
       //str=str.replaceAll("\\d","");
       //System.out.print(str + " ");
       //str =str.replaceAll("\\W", "");
       //System.out.print(str + " ");

        //System.out.println(str.replaceAll("\\s",""));//boslukları attı
        //System.out.println(str.replaceAll("\\d",""));//sayıları attı
        //System.out.println(str.replaceAll("\\W", ""));//karakterleri attı

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                strsonuc += " ";
            } else if (str.substring(i,i+1).matches("[A-z:a-z]")) {
                strsonuc += str.charAt(i);
            }
        }
        System.out.println("strsonuc = " + strsonuc);





    }


}


