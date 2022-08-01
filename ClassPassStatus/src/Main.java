import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("        CLASS PASS STATUS       ");

            int math, physic, chem, english, music ;

            Scanner scr = new Scanner(System.in);

            System.out.print(" Math score : ");
            math = scr.nextInt();

            System.out.print(" Physic score : ");
            physic = scr.nextInt();

            System.out.print(" Chem score : ");
            chem = scr.nextInt();

            System.out.print(" English score : ");
            english = scr.nextInt();

            System.out.print(" Music score : ");
            music = scr.nextInt();


            if (math<0 || math>100 ){
                math=0;
            }
            if (physic<0 || physic>100){
                physic=0;
            }
            if (chem<0||chem>100){
                chem=0;
            }
            if (english<0||english>100){
                english=0;
            }if (music<0 || music >100){
                music=0;
            }

            int totalScore = (math + physic + chem + english + music);

            double average = totalScore/5 ;

            System.out.println("Average Score : "+ average  );

            if (average<55){
                System.out.print("Failed");
            }else{
                System.out.print("Passed");
            }



    }
}
