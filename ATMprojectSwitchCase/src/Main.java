import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("        ATM PROJECT         ");

        String userName,password ;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right>0){

            System.out.print(" User Name : ");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("salih") && password.equals("12345")){
                System.out.println("HELLO !!! , Welcome  to the  SALIH BANK");


                do {
                    System.out.println("1-DEPOSIT\n" +
                            "2-WITHDRAW\n" +
                            "3-CHECK BALANCE\n" +
                            "4-EXIT");
                    System.out.print("Chose the operation!");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print(" Money Amount : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Your new Balance: " +balance);
                            break;
                        case 2:
                            System.out.print("Money amount : ");
                             price = input.nextInt();
                            if (price>balance){
                                System.out.println("Insufficient Balance");
                            }else {
                                balance -= price;
                            }
                            System.out.println("Your New Balance : "+balance);
                            break;
                        case 3:
                            System.out.print("Your Balance " + balance);
                            break;
                    }


                }while (select!=4);
                System.out.println("See you again");
                break;



            }else {

                right--;
                System.out.println("Incorrect username or password,TRY AGAIN!");
                if (right==0){
                    System.out.println("Your account blocked !! , please contact the bank");
                }else {
                    System.out.println("You Remaining attempts : " + right);
                }

            }



        }
    }
}
