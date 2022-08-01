import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        ADVISOR ACCORDING TO WEATHER        ");

        int temperature;

        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the weather degree in celsius : " );
        temperature = input.nextInt();

        if ( temperature < 5) {
            System.out.print(" You can ski");
        }else if (5<=temperature && temperature<15){
            System.out.print("you can go to Cinema");
        }else if (15<=temperature && temperature<25){
            System.out.print("You can go to Picnic");
        }else {
            System.out.print("you can go to swim");
        }
    }
}
