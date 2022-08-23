import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        Scanner scn = new Scanner(System.in);
        System.out.println("Your Number : ");
        int number = scn.nextInt();


        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("The nearest number smaller than the entered number : : " + min);
        System.out.println("The nearest number bigger than the entered number " + max);
    }
}
