import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rndm = new Random();
        int number = rndm.nextInt(100);

        Scanner scn = new Scanner(System.in);
        int right = 0 ;
        int selectedNumber ;

        //create array for wrong answers
        int[] wrong = new int[5];

        boolean isWin = false;
        boolean isWrong = false;

        while (right<5){
            System.out.print(" Please enter your Guess ? ");

            selectedNumber = scn.nextInt();

            if (selectedNumber <0 || selectedNumber > 99) {

                System.out.println("Please enter number between 1-100");

                if (isWrong){
                    right++;
                    System.out.println(" Too many incorrect entries. Remaining right:");
                }else{
                    isWrong=true;
                    System.out.println("Your next wrong entry will be deducted from your rights.");
                }
                continue;
            }

            if ( selectedNumber == number){
                System.out.println("Congratulations, correct guess! The number you guessed :" + number);
                isWin = true;
                break;
            }else {
                System.out.println("You entered an incorrect number! ");
                if (selectedNumber > number){
                    System.out.println(selectedNumber + " number is greater than the hidden number.");
                }else{
                    System.out.println("number is smaller than the hidden number.");
                }
                wrong[right++] = selectedNumber ;
                System.out.println("Remaining right: " + (5 - right));
            }
        }

        if (!isWin){
            System.out.println(" YOU LOSE !");
            if (! isWrong){
                System.out.println(" your guesses :  " + Arrays.toString(wrong));
            }
        }



    }
}
