import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("        SORTING NUMBERS         ");

            int number1, number2, number3 ;

            Scanner input = new Scanner(System.in);

            System.out.print("First Number : ");
            number1 = input.nextInt();

            System.out.print("Second Number : ");
            number2 = input.nextInt();

            System.out.print("Third Number : ");
            number3 = input.nextInt();

            if (number1>number2){

                if (number2>number3){

                    System.out.print("number1 > number2 > number3");

                }else if(number3>number2){

                    if (number1>number3){
                        System.out.print("number1>number3>number2");
                    }else if (number1<number3){
                        System.out.print("number3>number1>number2");
                    }else{
                        System.out.print("Number1=number3>number2");
                    }

                }else {
                    System.out.print("number1>number2=number3");
                }

            }else if(number2>number1){

                if (number1>number3){
                    System.out.print("number2>number1>number3");
                }else if (number3>number1){

                    if (number3>number2){
                        System.out.print("number3>number2>number1");
                    }else if (number2>number3){
                        System.out.print("number2>number3>number1");
                    }else{
                        System.out.print("number2=number3>number1");
                    }

                }else{
                    System.out.print("number2>number3=number1");
                }

            }else if (number3>number1){
                System.out.print("number3>number2=number1");
            }else{
                System.out.print("number3=number2=number1");
            }


    }
}
