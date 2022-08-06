import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        ARMSTRONG   NUMBER          ");

        /*
        3: 3^1 = 3
        153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
        125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
        1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643
        */


        int number,n ,temp, digits =0 , lastDigitValue = 0 , sumOfPowersOfDigit = 0 ;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number : ");
        number = input.nextInt();


        temp = number;
        //we find digits count of number with dividing 10
        while (temp>0){
            temp = temp /10 ;
            digits++;
        }

        temp = number;
        //We calculate sum of the powers of al the digits.
        while (temp>0){
            //We determine the last digit of Value
            lastDigitValue = temp%10;
            // calculate power of the value up to digit times and assign the result to sumOfPowersOfDigit variable
            sumOfPowersOfDigit += (Math.pow(lastDigitValue,digits));
            //delete the last digit
            temp = temp/10;
        }

        if (number==sumOfPowersOfDigit){
            System.out.println(number + " is ARMSTRONG NUMBER");
        }else{
            System.out.println(number +" is not a ARMSTRONG NUMBER");
        }





    }
}
