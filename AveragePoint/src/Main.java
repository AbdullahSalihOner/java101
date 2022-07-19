import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math, physic, chem, history, english, music ;

        Scanner scr = new Scanner(System.in);

        System.out.print(" Math score : ");
        math = scr.nextInt();

        System.out.print(" Physic score : ");
        physic = scr.nextInt();

        System.out.print(" Chem score : ");
        chem = scr.nextInt();

        System.out.print(" History score : ");
        history = scr.nextInt();

        System.out.print(" English score : ");
        english = scr.nextInt();

        System.out.print(" Music score : ");
        music = scr.nextInt();

        int totalScore = (math + physic + chem + history + english + music);

        double average = totalScore/6 ;

        System.out.println("Average Score : "+ average  );

        double minPassingScore = 60;

        double result;

        //Without if-else
        String a = "passed" , b = "failed";

        result = (average >= 60) ? 1 : 0 ;

        System.out.println( result==1 ? a : b);

        //with if-else
        /*
        if (average<60){
            System.out.print("Failed");
        }else{
            System.out.print("Passed");
        }*/


    }
}
