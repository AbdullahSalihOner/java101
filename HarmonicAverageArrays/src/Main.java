public class Main {
    public static void main(String[] args) {
        System.out.println("        HARMONIC AVERAGE CALCULATOR         ");

        int[] list = {1,2,3,4,5};
        double total = 0.0 ;

        //We calculate harmonic sum.
        for (int i = 0; i < list.length ; i++){
            total = total + (1/list[i]);
        }


        double harmonicAverage = (list.length)/total ;

        System.out.println(harmonicAverage);

    }
}
