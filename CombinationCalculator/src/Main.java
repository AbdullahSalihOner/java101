import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        COMBINATION CALCULATOR      ");

        int n , r ;
        int result1=1, result2=1, result3 = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Number A 'C(A,B)': ");
        n = input.nextInt();

        System.out.println("Enter your Number B 'C(A,B)': ");
        r = input.nextInt();


        //a equals to (n-r)
        int a = n-r ;

       // C(n,r) = n! / (r! * (n-r)!)
        for (int i=1 ; i<=n ; i++){
            result1 = result1 * i ;

        }
        for (int j = 1 ; j<=r ; j++){
            result2 =  result2 * j ;

        }
        for (int k = 1 ; k<=a ; k++){
            result3 = result3 * k;
        }

        int answer = result1/(result2 * result3) ;
        System.out.println("Result of Combination " + answer);

    }
}
