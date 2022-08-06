import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        FIND MAX AND MIN NUMBER         ");

        Scanner scn = new Scanner(System.in);

        int n , maxNumber=0 , minNumber=0;
        System.out.println("How many numbers will you enter ? ");
        n = scn.nextInt();


        for (int i = 1 ; i<=n ;i++){
            System.out.print(i + ". number : ");
            int number = scn.nextInt();

            if (i==1){
                number = maxNumber;
                number=  minNumber;

            }else {

                if (number>maxNumber){
                    maxNumber=number;

                }else{
                    minNumber= number;
                }
            }
        }

        System.out.println("The biggest number : " + maxNumber);
        System.out.println("The smallest number : " +minNumber);


    }
}
