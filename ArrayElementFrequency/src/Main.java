import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            int[] list = {10, 20, 20, 10, 10, 20, 5, 20 ,36, 36};

            int counter = 0 ;
            Arrays.sort(list);

            for (int i = 0 ; i < list.length ; i ++){

                counter=0 ;
                for (int j =0 ; j <list.length  ; j++){
                    if (list[i] == list[j]){
                        counter++;
                    }
                }



                if(i==0 && list[i+1]==list[i])
                {
                    System.out.println(("there are "+ counter +" of " + list[i]));
                }

                if(i==0 && list[i+1]!=list[i])
                {
                    System.out.println(("there are " + counter + " of " +list[i]));
                }

                if(i!=0 && list[i-1]!=list[i])
                {
                    System.out.println(("there are " + counter + " of " +list[i]));
                }
            }


    }
}
