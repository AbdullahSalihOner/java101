import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("        BODY MASS INDEX     ");

         double h,w;
         double bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height(in meter) : ");
        h = input.nextDouble();

        System.out.print("Please enter your weight (in kg) : ");
        w = input.nextDouble();


        bmi = w / (h * h) ;

        System.out.print("Your BMI : " + bmi);

    }
}
