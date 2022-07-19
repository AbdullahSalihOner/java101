import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("         HYPOTENUSE CALCULATOR      ");

        double a,b,h;

        Scanner  value = new Scanner(System.in);
        System.out.print(" enter first perpendicular edge : ");
        a = value.nextDouble();

        System.out.print(" enter  second perpendicular edge : ");
        b = value.nextDouble();

        h = Math.sqrt(a*a + b*b);

        System.out.print(" Hypotenuse : " + h);


    }
}
