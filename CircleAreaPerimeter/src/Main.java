import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14 ;

        Scanner input = new Scanner(System.in);

        System.out.print(" enter the radius : ");
        r = input.nextInt();
        double area = pi * r * r ;
        double perimeter = 2 * pi * r ;

        System.out.println(" Circle Area : " + area);
        System.out.println(" Circle Perimeter : " + perimeter);
    }
}
