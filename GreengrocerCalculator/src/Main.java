import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        GREENGROCER CALCULATOR      ");

        double apple = 3.67, banana = 0.95, tomato = 1.11 , pear = 2.14, eggplant = 5.0 ;
        double totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("how many kilos of apple ? : ");
        apple = apple * input.nextDouble();

        System.out.print("how many kilos of banana ? : ");
        banana = banana * input.nextDouble();

        System.out.print("how many kilos of tomato ? : ");
        tomato = tomato * input.nextDouble();

        System.out.print("how many kilos of pear ? : ");
        pear = pear * input.nextDouble();

        System.out.print("how many kilos of eggplant ? : ");
        eggplant = eggplant * input.nextDouble();

        totalPrice =  apple + banana + tomato + pear + eggplant ;

        System.out.println("Total Price : " +totalPrice+ " TL");
    }
}
