import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        FIND PRIME NUMBERS          ");


        int isPrime = 0;
        for (int i=2 ;i<100 ;i++ ) {

            isPrime =0;

            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    isPrime = 1;
                    break;
                }

            }
            if (isPrime==0) {
                System.out.print(i+" ");
            }
        }



    }
}
