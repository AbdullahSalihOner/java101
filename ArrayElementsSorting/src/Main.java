import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        System.out.print("What is length of your ARRAY : ");
        int lngth = scn.nextInt();

        System.out.println(" The length of Array :  " + lngth);

        if (lngth>0){
            int[] array = new int[lngth];
            int n = 1;
            for (int i = 0 ; i <lngth ; i++){
                System.out.print(n+". element :");
                n++;
                array[i] = scn.nextInt();
            }

            Arrays.sort(array);
            System.out.println("Sorting  : " + Arrays.toString(array));


        }else {
            System.out.println(" Wrong entrance");
        }



    }
}
