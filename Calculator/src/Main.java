import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        CALCULATOR      ");

        double number1, number2;
        int operation;

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter the first number : ");
        number1 = input.nextInt();
        System.out.print(" Enter the second number : ");
        number2 = input.nextInt();

        System.out.print(" Please select a operation : \n");
        System.out.println(" 1)Collect(+) \n 2)Minus(-) \n 3)Multiply(*) \n 4)Divide(/)" );
        System.out.print(" Your Choice :");
        operation = input.nextInt();


        //WİTH IF ELSE
       /* if (operation == 1){
            System.out.print("Result = " +(number1 + number2));
        }else if (operation == 2){
            System.out.print("Result = " + (number1-number2));
        }else if(operation == 3){
            System.out.print("Result = " + (number1*number2));
        }else if (operation==4){
            System.out.print(" Result = "+ (number1/number2));
        }else{
            System.out.print(" ERROR, wrong valur entry");
        }*/

        //SWITCH CASE
        switch (operation){
            case 1:
                System.out.print("Result = " +(number1 + number2));
                break;
            case 2:
                System.out.print("Result = " + (number1-number2));
                break;
            case 3:
                System.out.print("Result = " + (number1*number2));
                break;
            case 4 :
                System.out.print(" Result = "+ (number1/number2));
                break;
            default:
                System.out.print(" ERROR, wrong valur entry");

        }

    }
}
