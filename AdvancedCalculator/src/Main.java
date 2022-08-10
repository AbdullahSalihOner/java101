import java.util.Scanner;

public class Main {

    static void plus(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number a : ");
        int a = scn.nextInt();
        System.out.print("Enter your number b : ");
        int b = scn.nextInt();

        int result = a + b ;
        System.out.println(" Result : " + result);
    }

    static void minus ( ){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number a : ");
        int a = scn.nextInt();
        System.out.print("Enter your number b : ");
        int b = scn.nextInt();

        int result = 0 ;
        if (a > b){
            result = a - b ;
        }else{
            result = b - a ;
        }
        System.out.println(" Result : " + result);
    }

    static void times (){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number a : ");
        int a = scn.nextInt();
        System.out.print("Enter your number b : ");
        int b = scn.nextInt();

        int result = a * b ;
        System.out.println(" Result : " + result);
    }

    static void  divide (){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number a : ");
        int a = scn.nextInt();
        System.out.print("Enter your number b : ");
        int b = scn.nextInt();

        double result = a/b ;
        System.out.println(" Result : " + result);
    }

    static void power (){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number a : ");
        int a = scn.nextInt();
        System.out.print("Enter your number b : ");
        int b = scn.nextInt();
        int result = 1;

        for (int i = 1 ; i<= b ; i++){
            result = result * a ;
        }
        System.out.println(" Result : " + result);
    }

    static void factorial (){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number a : ");
        int a = scn.nextInt();

        int result = 1;
        for (int i = 1 ; i <= a ; i++){
            result *= i ;
        }
        System.out.println(" Result : " + result);
    }

    static void mod (){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number a : ");
        int a = scn.nextInt();
        System.out.print("Enter your number b : ");
        int b = scn.nextInt();

        int result = a % b ;
        System.out.println(" Result : " + result);
    }

    static void rectangleCalculator(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number a : ");
        int a = scn.nextInt();
        System.out.print("Enter your number b : ");
        int b = scn.nextInt();

        int area = a * b ;
        int perimeter = 2 * ( a + b );

        System.out.println("Area :" +area);
        System.out.println("Perimeter : " + perimeter);
    }

    public static void main(String[] args) {
        System.out.println("            ADVANCED CALCULATOR         ");

        Scanner scn = new Scanner(System.in);
        int select ;
        System.out.println("Please Select your operation :");
        String menu = " 1 - plus \n "
                + "2 - minus \n "
                + "3 - times \n"
                + "4 - divide \n"
                + "5 - power \n"
                + "6 - factorial \n"
                + "7 - mod \n"
                + "8 - Area and perimeter of rectangle \n"
                + "0 - EXIT ";

        do {
            System.out.println(menu);
            System.out.println("Please , chose a process : ");
            select = scn.nextInt();



            switch (select){
                case 1:
                    plus();
                    break;
                case  2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleCalculator();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid value entered , tyr again");
            }

        }while (select!=0);
    }
}
