import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        HARMONIC NUMBER CALCULATOR      ");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N number : ");
        int n = input.nextInt();
        double result =0.0;

        for (double i = 1; i <= n ; i++){
                result = result + (1/i) ;
        }

        System.out.println(result);

    }
}
