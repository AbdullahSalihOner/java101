import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        HOROSCOPE FINDER        ");

        int day, month ;

        Scanner input = new Scanner(System.in);

        System.out.print("Birth month as number : ");
        month = input.nextInt();

        System.out.print("Birth day as number : ");
        day = input.nextInt();

        if (month==1){
            if (day<=21){
                System.out.println("CAPRICON");
            }else if(21<day && day <=31){
                System.out.println("AQUARIUS");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if(month==2){
            if (day<=19){
                System.out.println("AQUARIUS");
            }else if (day <=29 && day>19){
                System.out.println("PISCES");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if (month==3){
            if (day<=20){
                System.out.println("PISCES");
            }else if (day<=31 && day>20){
                System.out.println("ARIES");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if (month==4){
            if (day<=20){
                System.out.println("ARIES");
            }else if (day<=30 && day > 20){
                 System.out.println("TAURUS");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if (month == 5){
            if (day<=21){
                System.out.println("TAURUS");
            }else if (day>21 && day<=31){
                System.out.println("GEMINI");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if (month == 6){
            if (day<=23){
                System.out.println("GEMINI");
            }else if (day<=30){
                System.out.println("CANCER");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if (month==7){
            if (day<=23){
                System.out.println("CANCER");
            }else if ( day<=31 && day > 23){
                System.out.println("LEO");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if (month==8){
            if (day<=23){
                System.out.println("LEO");
            }else if (day>23 && day<=31){
                System.out.println("VIRGO");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if (month==9){
            if (day <= 23){
                System.out.println("VIRGO");
            }else if (day>23 && day <=30){
                System.out.println("LIBRA");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if (month==10){
            if (day <=23){
                System.out.println("LIBRA");
            }else if (day>23&&day<=31){
                System.out.println("SCORPIO");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if (month == 11){
            if (day <= 22){
                System.out.println("SCORPIO");
            }else if (day>22 && day <= 30){
                System.out.println("SAGITTARIUS");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else if (month== 12){
            if (day<=21){
                System.out.println("SAGITTARIUS");
            }else if (day > 21 && day <=31){
                System.out.println("CAPRICON");
            }else{
                System.out.println("INVALID VALUE");
            }


        }else{
            System.out.println("INVALID VALUE");
        }
    }
}
