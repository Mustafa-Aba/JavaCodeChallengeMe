package TaskCozum.task10Methots;

public class Task09 {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz


    */
        System.out.println(howManySeconds(2));
    }

    private static int howManySeconds(int i) {
        int dk = i * 60;
        int sn = dk * 60;
        return sn;

    }
}
