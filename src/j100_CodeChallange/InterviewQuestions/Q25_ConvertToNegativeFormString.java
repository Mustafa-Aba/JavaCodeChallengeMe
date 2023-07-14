package j100_CodeChallange.InterviewQuestions;

public class Q25_ConvertToNegativeFormString {
    /*  Task->
      Convert the given Array to negative form sentence into a String.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {
        String[] arr = {"J", "a", "v", "a", "I", "s", "D", "i", "f", "f", "i", "c", "u", "l", "t"};
        StringBuilder cumle = new StringBuilder();
        String str="";
        for (String s : arr) {
            cumle.append(s);
            str=str.concat(s);
        }
        cumle.insert(cumle.indexOf("Is") + 2, "NOT");
        System.out.println("cumle = " + cumle);
        System.out.println("str.replace(\"Is\",\"IsNot\") = " + str.replace("Is", "IsNot"));

    }

}
