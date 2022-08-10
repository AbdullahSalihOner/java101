import java.util.Scanner;

public class Main {


    static int methodPattern(int number,boolean isPositive ,int temp){

        if (number<=0){
            number = number + 5 ;
            System.out.print(number + " ");
             return methodPattern(number,true ,temp);
        }


        if (isPositive ){
            if (number !=temp){
                number = number +5 ;
                System.out.print(number + " ");
                return methodPattern(number,true,temp);
            }else {
                return temp;
            }
        }else{
            number = number - 5 ;
            System.out.print(number + " ");
            return methodPattern(number,false,temp);
        }


    }



    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your Number : ");
        int number = scn.nextInt();

        System.out.print(number + " ");
        methodPattern(number,false ,number);

    }
}
