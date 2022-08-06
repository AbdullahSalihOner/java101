import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        PERFECT NUMBER FINDER       ");

        Scanner scn = new Scanner(System.in);

        int number;
        System.out.print("Enter your number : ");
        number = scn.nextInt();

        int collect=0;
        for (int i = 1 ; i < number ; i++){

            if (number%i==0){
                collect+=i;
            }
        }

        if (number==collect){
            System.out.println(number+" is perfect number");
        }else{
            System.out.println(number+" is not a perfect number ");
        }


    }
}
