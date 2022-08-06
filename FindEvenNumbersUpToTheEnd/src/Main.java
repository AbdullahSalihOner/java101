import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        FIND EVEN NUMBERS UP TO THE END     ");

        int k , j=0, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        k = input.nextInt();

        for (int i = 1; i<= k ; i++){
            if (i % 3 == 0 && i % 4 == 0){
                j = j + 1 ;
                total += i ;
            }

        }
        System.out.println("Sum Of Numbers : " + total);
        System.out.println("Average of Numbers :" + total/j);

    }
}
