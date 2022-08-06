import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        HCF and LCM CALCULATOR      ");
        // hcf (the highest common factor]-----The Least Common Multiple ( LCM )
        Scanner scn = new Scanner(System.in);

        int number1 , number2 ;

        System.out.print("Enter Number 1 : ");
        number1 = scn.nextInt();

        System.out.print("Enter Number 2 : ");
        number2 = scn.nextInt();


        // Answer with FOR LOOP
        /*
        int HCF;
        for (int i = number1 ; i >=1 ; i-- ){
            if (number1 % i == 0 && number2 % i ==0){
                HCF = i ;
                System.out.println(HCF);
                break;
            }
        }

        int LCM;
        for (int j = 1; j <= (number1*number2); j++) {
            if (j % number1 == 0 && j % number2 == 0){
                System.out.print(j);
                break;
            }
        }
        */

        //ANSWER WITH WHILE LOOP
        int k = number1;
        int HCF;
        while (k >=1 ){
            if ( number1 % k == 0 && number2 % k == 0){
                HCF = k ;
                System.out.println(HCF);
                break;
            }
            k--;
        }


        int l = number1 ;
        int LCM;
        while ( l<=(number1*number2) ){
            if ( l % number1 == 0 && l % number2 == 0){
                LCM = l ;
                System.out.print(LCM);
                break;
            }
            l++;
        }


    }
}
