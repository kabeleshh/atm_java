import java.util.*;
import java.time.LocalDateTime;

public class Atm{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        LocalDateTime d = LocalDateTime.now();
        int acc_no = 12345678;
        int pw = 1064;
        int balance = 50000;
        int amt_deposit = 0;
        int amt_withdraw = 0;
        int option;

        System.out.println("                                                                           Date and Time : "+d);
        System.out.println("Welcome back to our AtoZ ATM");
        System.out.println("Enter your Account number : ");
        acc_no = s.nextInt();
        if(acc_no == 12345678){
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("You need to enter your password to access your bank account");
            System.out.println("Enter your password : ");
            pw = s.nextInt();

            if(pw == 1064){
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("How can I assist you Sir/Mam");
                while(true){
                    System.out.println("Press 1 to deposit cash");
                    System.out.println("Press 2 to withdrawal of cash");
                    System.out.println("Press 3 to check the bank balance");
                    System.out.println("Press 4 to get the receipt");
                    System.out.println("Press 5 to Exit your process");

                    option = s.nextInt();
                
                    switch(option){
                        case 1:
                            System.out.println("How much amount you need to deposit : ");
                            amt_deposit = s.nextInt();
                            balance = balance + amt_deposit;
                            System.out.println("Amount deposited successfully"+"                                            "+d);
                            System.out.println("----------------------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("How much amount you need to withdraw : ");
                            amt_withdraw = s.nextInt();
                            if(amt_withdraw > balance){
                                System.out.println("Please Enter the sufficient amount");
                            }
                            else{
                                balance = balance - amt_withdraw;
                            }
                            System.out.println("Amount withdrew successfully"+"                                             "+d);
                            System.out.println("----------------------------------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("Your bank balance : "+balance+"                                             "+d);
                            System.out.println("----------------------------------------------------------------------------");
                            break;
                        case 4:
                            System.out.println("                                                                            "+d);
                            System.out.println("Your account's bank balance : "+balance);
                            System.out.println("Your past deposit amount : "+amt_deposit);
                            System.out.println("Your past withdrew amount : "+amt_withdraw);
                            System.out.println("Thank You for visiting AtoZ ATM");
                            System.out.println("---------------------------------------------------------------------------");
                            break;
                        default:
                            System.out.println("Thank you for visiting AtoZ ATM");
                            System.out.println("---------------------------------------------------------------------------");    
                    }
                    if(option == 5){
                        System.out.println("Thank you for visiting AtoZ ATM");
                        System.out.println("-------------------------------------------------------------------------------");
                        break;
                    }
                
                }
            }
            
        }
        else{
            System.out.println("                                                                                       "+d);
            System.out.println("Kindly enter the valid pin");
            System.out.println("Try again");
        }
        s.close();
    }
}