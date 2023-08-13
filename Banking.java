import java.util.Scanner;


public class Banking{
    public static void main(String args[]){
       Bankaccount obj=new Bankaccount("XYZ","10123");
       obj.showMenu();

    }
    class Bankaccount{
        int balance;
        int previousTransaction;
        String customername;
        String customerId;
        
        Bankaccount(String cname,String cid)
        {
            customername=cname;
            customerId=cid;
            return cname;
        }
        
        void deposit(int amount){
            if(amount!=0){
                balance=balance+amount;
                previousTransaction=amount;
            }
        }
        
        void withdraw(int amount){
            if(amount!=0){
                balance=balance-amount;
                previousTransaction=-amount;
            }
        }
        void getpreviousTransaction(){
            if(previousTransaction>0){
                System.out.println("Deposited:"+previousTransaction);
            }
            else if(previousTransaction<0){
                System.out.println("Withdraw:"+Math.abs(previousTransaction));
            }
            else{
                System.out.println("No transaction Occured");
            }
        }

        void showMenu(){
            char option='\0';
            Scanner obj1=new Scanner(System.in);
            System.out.println("Welcome customer");
            System.out.println("A  check balance");
            System.out.println("B  Deposit");
            System.out.println("C  withdraw");
            System.out.println("D  previous Transaction");
            System.out.println("E  Customer_name and id");
            System.out.println("F  Exit");
            
            do{
                System.out.println("Enter character");
                option=obj1.next().charAt(0);
                switch(option){
                    case 'A':
                        System.out.println("Balance"+ balance);
                        System.out.println("\n");
                        break;
                    case 'B':
                        System.out.println("Enter amount to deposit");
                        int amount=obj1.nextInt();
                        deposit(amount);
                        System.out.println("\n");
                        break;
                    case 'C':
                        System.out.println("Enter amount to withdraw");
                        int amount2=obj1.nextInt();
                        withdraw(amount2);
                        System.out.println("\n");
                        break;
                    case 'D':
                        getpreviousTransaction();
                        System.out.println("\n");
                        break;
               
                    case 'E':
                        System.out.println("************************");
                        break;
                    default:
                        System.out.println("Invalid optiion! Please try again");
                        break;
                }
            }
             while(option!='F');
            System.out.println("Thankyou for using our Services");
       }
    }    
}              
