import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("        AIRPLANE TICKET PRICE CALCULATOR        ");

        int  age , tripType ;
        double distance , totalPrice , netPrice ;
        Scanner input = new Scanner(System.in);

        System.out.print("Please write your distance in KM : " );
        distance = input.nextDouble();

        System.out.print("Please your age : ");
        age = input.nextInt();

        System.out.print("Please select your type of TRIP 1)ONE-WAY 2)RETURN :");
        tripType=input.nextInt();


        if (tripType==1){

            if (distance>0){

                if (age<12 && age >= 0){
                    totalPrice= distance * (0.10 *2 *50/100) ;
                    System.out.println(" Your net price : " + totalPrice + " TL");
                }else if (age<=24 && age>=12){
                    totalPrice= distance * (0.10 *2  *90/100) ;
                    System.out.println(" Your net price : " + totalPrice + " TL");
                }else if ( age >= 65){
                    totalPrice= distance * (0.10 *2 *70/100) ;
                    System.out.println(" Your net price : " + totalPrice + " TL");
                }else {
                    totalPrice= distance * (0.10  ) ;
                    System.out.println("Your Net price : "+ totalPrice + " TL");
                }

                totalPrice = distance * (0.10) ;

            }else{
                System.out.println("please write positive valid distance ");
            }

        }else if (tripType== 2){

            if (distance>0){

                    if (age<12 && age >= 0){
                        totalPrice= distance * (0.10 *2 * 80/100 *50/100) ;
                        System.out.println(" Your net price * : " + totalPrice + " TL");
                    }else if (age<=24 && age>=12){
                        totalPrice= distance * (0.10 *2 * 80/100 *90/100) ;
                        System.out.println(" Your net price * : " + totalPrice + " TL");
                    }else if ( age >= 65){
                        totalPrice= distance * (0.10 *2 * 80/100 *70/100) ;
                        System.out.println(" Your net price * : " + totalPrice + " TL");
                    }else {
                        totalPrice= distance * (0.10 *2 ) ;
                        System.out.println("Your Net price : "+ totalPrice + " TL");
                    }

            }else{
                System.out.println("please write positive valid distance ");
            }

        }else {
            System.out.println("Please be careful!!, You have made an Invalid choice");
        }




    }
}
