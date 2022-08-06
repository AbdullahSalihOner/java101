import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("            EXPONENTIAL CALCULATOR          ");

        int n,k ;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter main number :  ");
        n = input.nextInt();

        System.out.print("Enter number of power  :  ");
        k = input.nextInt();

        int total = 1 ;


        //calculation with whileı
        //int i = 1;
        /*while (i <= k){
            total = total * n ;
            i++;
        }*/

        for (int i = 1; i<=k ; i++){
            total = total * n ;
        }
        System.out.println("Answer  : "  +total );


    }
}
