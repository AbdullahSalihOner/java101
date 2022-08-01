import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        CHINESE ZODIAC CALCULATOR       ");

        Scanner input = new Scanner(System.in);
        int birthYear ;

        System.out.print("Birth year  : ");
        birthYear = input.nextInt();

        if (birthYear%12 == 1){
            System.out.println("Zodiac Sign : ROOSTER");
        }else if (birthYear%12 == 2){
            System.out.println("Zodiac Sign : DOG");
        }else if (birthYear%12 == 3){
            System.out.println("Zodiac Sign : PIG");
        }else if (birthYear%12 == 4){
            System.out.println("Zodiac Sign : RAT");
        }else if (birthYear%12 == 5){
            System.out.println("Zodiac Sign : OX");
        }else if (birthYear%12 == 6){
            System.out.println("Zodiac Sign : TIGER");
        }else if (birthYear%12 == 7){
            System.out.println("Zodiac Sign : RABBIT");
        }else if (birthYear%12 == 8){
            System.out.println("Zodiac Sign : DRAGON");
        }else if (birthYear%12 == 9){
            System.out.println("Zodiac Sign : SNAKE");
        }else if (birthYear%12 == 10){
            System.out.println("Zodiac Sign : HORSE");
        }else if (birthYear%12 == 11){
            System.out.println("Zodiac Sign : GOAT");
        }else if (birthYear%12 == 0){
            System.out.println("Zodiac Sign : MONKEY");
        }else{
            System.out.println("Invalid value !!!!!");
        }
    }
}
