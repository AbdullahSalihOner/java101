import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance;
        double perKm =4.50, total , startPrice = 15;

        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter distance in KM : ");
        distance = input.nextInt();

        total = distance * perKm ;
        total += startPrice;

        total = (total < 20) ? 20 : total ;
        System.out.println("Toplam Tutar : " + total);


    }
}
