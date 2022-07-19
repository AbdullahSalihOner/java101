import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("        TAX CALCULATOR      ");

            double price;

            Scanner  cost= new Scanner(System.in);
            System.out.print( "Please, enter product price :  ");
            price = cost.nextDouble();

            double taxAmount = 0.18;
            double totalPrice ;


            totalPrice = price + (price*taxAmount);

            System.out.println("Total Price  : " + totalPrice);
    }
}
