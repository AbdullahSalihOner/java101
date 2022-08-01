import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        LEAP YEAR CALCULATOR        ");

        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the year ? : ");
        year = input.nextInt();

        if (year%4 ==0){
            System.out.println( year + " is LEAP YEAR ");
        }else if (year%4!=0){
            System.out.println( year + " is not LEAP YEAR ");
        }else{
            System.out.println("Invalid value");
        }
    }
}
