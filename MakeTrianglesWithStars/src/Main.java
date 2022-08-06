import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        TRIANGLES WITH STARTS       ");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of stars : ");
        int n = input.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n -i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }




    }
}
