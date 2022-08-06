import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        ODD NUMBERS COLLECT      ");


        int number;
        int total = 0 ;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter Number : ");
            number = input.nextInt();
            if (number % 2 == 0 && number % 4 == 0){
                total += number;
            }

        }while (number % 2 == 0);

        System.out.println("Total of Numbers : " + total);
    }
}
