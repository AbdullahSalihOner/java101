public class Main {

    static int result = 1;
    static  int exponential(int a , int b){
        if (b == 0) return 1 ;

        result = result * a;
        exponential(a , b-1);

        return result;
    }

    public static void main(String[] args) {
        // a is base
        // b is power of number

        System.out.println(exponential(9,2));
    }
}
