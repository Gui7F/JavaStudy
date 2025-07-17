package application;
import java.util.Locale;
import java.util.Scanner;
import utils.Bank;

class Program {
   public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name of Holder:");
        String accountHolder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)?");
        char response = sc.next().charAt(0);

        double initialDeposit = 0.0;
       
        if(response == 'y' || response == 'Y' ){
            System.out.println("Enter initial deposit value: ");
           initialDeposit = sc.nextDouble();
           sc.nextLine();
        }
        
        

        Bank bank = new Bank(accountNumber, accountHolder, initialDeposit);

        System.out.println("Account data:");
        System.out.println(bank.toString());

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bank.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.println(bank.toString());

        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bank.withdraw(withdrawValue, bank.getBalance());

        System.out.println("Updated account data:");
        System.out.println(bank.toString());

        sc.close();

   }
    
}