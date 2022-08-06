import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        FACTORIAL CALCULATOR        ");

        int n , result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number :  ");
        n = input.nextInt();

        for ( int i  = 1 ; i<=n ; i++){
            result = result * i ;
            if (i==n){
                System.out.println("Factorial of "+n+" : " + result);
            }
        }


    }
}
