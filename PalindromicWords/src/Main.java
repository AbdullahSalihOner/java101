import java.util.Scanner;

public class Main {

    static boolean isPalindrom(String a){
        String reverse ="" ;
        for (int i =a.length()-1 ; i>=0; i--){
            reverse += a.charAt(i);
        }
        if (a.equals(reverse)){return true;}
        return false;
    };

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Your word : ");
        String word1 = scn.next();

        System.out.println(isPalindrom(word1));

    }
}
