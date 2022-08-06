public class Main {
    public static void main(String[] args) {
        for (int number =1; number<=999 ; number++){
            int  temp, digits =0 , lastDigitValue = 0 , sumOfPowersOfDigit = 0 ;
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
            if (number==sumOfPowersOfDigit) {
                System.out.println("It is ARMSTRONG NUMBER : " + number);
            }


        }
    }
}
