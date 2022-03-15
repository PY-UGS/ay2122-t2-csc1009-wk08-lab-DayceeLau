import java.util.*;

public class Wk08BankDemoTest
{
    public static void main(String[] args)
    {
        Wk08CheckingAccount Acccount = new Wk08CheckingAccount(123,50.0);
        double deposit=0, withdrawal=0;
        try
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Current Balance: " + Acccount.getBalance());
            
            System.out.print("Deposit Amount: $");
            deposit = input.nextDouble();
            Acccount.deposit(deposit);
            
            System.out.print("Withdrawal Amount: $");
            withdrawal = input.nextDouble();
            Acccount.withdraw(withdrawal);

            
            System.out.println("The balance after withdraw is: $" + String.format("%.2f", Acccount.getBalance()));
        }
        catch(Exception e)
        {
            System.out.println(e);
            if(withdrawal>=0 && withdrawal> Acccount.getBalance()){
                System.out.println("Sorry, but your account is short by: $" + String.format("%.2f", withdrawal - Acccount.getBalance()));
            }
            //d. If $yy > $xx, print the user-defined exception and short amount “Sorry, but your account is short by: $""
           
        }
    }
}
