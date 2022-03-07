public class Wk08CheckingAccount
{
    private Double balance;
    private int accountNumber;

    Wk08CheckingAccount(int accountNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    Wk08CheckingAccount(int accountNumber, Double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double deposit)
    {
        if( deposit>=0 )  this.balance += deposit;
    }

    public void withdraw(double withdrawal) throws Wk08InsufficientFundsException
    {
        if(withdrawal >=0 )
        {
            if(withdrawal > this.balance)
            {
                throw new Wk08InsufficientFundsException("Withdrawal amount exceeds current balance.");
            }
            else
            {
                this.balance -= withdrawal;
            }
        }
    }

    public double getBalance()
    {
        return this.balance;
    }

    public int getNumber()
    {
        return this.accountNumber;
    }
}