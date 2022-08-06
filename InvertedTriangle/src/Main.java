import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        INVERTED TRIANGLE       ");


        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of stars : ");
        int n = input.nextInt();

        for (int i = n; i > 0 ; i--) {
            for (int j = (n - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
