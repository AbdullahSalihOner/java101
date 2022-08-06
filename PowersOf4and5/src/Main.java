import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        POWERS OF 4 AND 5 UP TO ENTERED NUMBER      ");

        int n , orderFour = 1 , orderFive = 1 ;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number : ");
        n = input.nextInt();



        System.out.println("***********POWERS OF 4************");
        double totalOfFour = 0.0 ;
        for (int i = 1 ; i<=n ; i*=4){

            System.out.println(orderFour +". Powers of 4 to the n : "+ i);
            totalOfFour += i;
            orderFour++;

        }
        orderFour--;
        System.out.println("Total of powers of four : " + totalOfFour);


        double totalOfFive = 0.0;
        System.out.println("***********POWERS OF 5************");
        for (int i = 1 ; i<=n ; i*=5){

            System.out.println(orderFive +". Powers of 5 to the n : "+ i);
            totalOfFive += i;
            orderFive++;
        }
        orderFive--;
        System.out.println("Total of powers of five : " +totalOfFive);


        average = (totalOfFive+totalOfFour)/(orderFive+orderFour) ;
        System.out.println("Average : " +average);
    }
}
