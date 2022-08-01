import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("        USER LOGIN      ");

            String loginUserName, loginPassword , newPassword , newPassword1 , newPassword2 , newUserName;
            String  userName="salih" , password = "12345";

            Scanner input = new Scanner(System.in);

            System.out.print("User Name : ");
            loginUserName = input.nextLine();

            System.out.print("Password : ");
            loginPassword = input.nextLine();

            // first validation
            if (loginUserName.equals(userName) && loginPassword.equals(password)){
                System.out.println(" login successful");
            //
            }else if (loginPassword.equals(password)==false){

                System.out.println("  wrong password entry , please try again");
                System.out.print(" Do you want to reset your password( yes(1) / no(2) ) : ");
                // user want to change password
                if (input.nextLine().equals("1")){

                    System.out.println("Please write your new password : ");
                    newPassword1 = input.nextLine();
                    System.out.println("Please write your new password again : ");
                    newPassword2 = input.nextLine();

                    // We check are newPassword1 and newPassword2 same or not
                    if (newPassword1.equals(newPassword2)){

                        //We check old password and new password same or not
                        if (newPassword2.equals(password) && newPassword1.equals(password)){
                            System.out.println("New password can not be same with your old password, Please chose another");
                        }else {
                            newPassword  = newPassword1 ;
                            System.out.println("New password created!!! ");
                        }

                    }else{
                        System.out.println("Passwords are not match, please be careful !");
                    }

                }else if (input.nextLine().equals("2")){
                    System.out.println("Try again to Login");
                }else{
                    System.out.println("Invalid answer , please try again");
                }

            }else if (loginUserName.equals(userName)==false){
                System.out.print("Username is wrong");
            }


    }
}
