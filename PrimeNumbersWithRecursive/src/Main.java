import java.util.Scanner;

public class Main {
    static void prime(int a , int n){

            if (n == a){
                System.out.println(a + " is Prime number");
                return;
            }
            else if (a % n == 0) {
                System.out.println(a +" is not a Prime Number");
                return;
            }

       prime(a , n+1);
    }

    public static void main(String[] args) {
        System.out.println("        PRIME NUMBERS WITH RECURSIVE        ");

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int number = scn.nextInt();

        prime(number,2);
    }
}
