import java.util.Scanner;

class Banking {
    double balance;

    void deposite(double amount){
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("amount deposite succesfully.");
            
        }else{
            
            System.out.println("invalid deposit succesfully");
        }
    }

void withdraw(double amount){
    if (amount <= 0 ){
        System.out.println("invalid withdrawl amount : ");

    }else if ( amount > balance ) {
        System.out.println("insufficent Balance : ");

    }else
    {
        balance = balance - amount;
        System.out.println("Amount withdrawn succesfully : ");
    }
}

void displayBalance(){

    System.out.println("current balance:Rs" + balance);
}
}
 public class Question1{
    public static void main (String[] args){
      

        Scanner input = new Scanner(System.in);
        Banking account = new Banking();

        System.out.print("Enter deposite amount : ");
        double depositeAmount = input.nextDouble();

        account.deposite(depositeAmount);
        account.displayBalance();

        System.out.print("Enter Withrawamount : ");
        double withdrawAmount = input.nextDouble();
        
        account.withdraw(withdrawAmount);
        account.displayBalance();

        input.close();
    }
}