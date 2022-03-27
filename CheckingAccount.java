public class CheckingAccount
{
    private Double balance;
    private int accountNumber;

    WCheckingAccount(int accountNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    CheckingAccount(int accountNumber, Double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double deposit) throws InsufficientFundsException
    {
        if( deposit>=0 )  this.balance += deposit;      //If deposit amount > 0 do function
        if(deposit <= 0){                               //If deposit amount < 0 throw exception
            throw new InsufficientFundsException("No deposit of negative numbers or 0.");
        }
    }

    public void withdraw(double withdrawal) throws InsufficientFundsException
    {
        if(withdrawal >=0 )     //If withdrawal amount > 0
        {
            if(withdrawal > this.balance)
            {
                throw new InsufficientFundsException("Withdrawal amount exceeds current balance.");     //Throw exception if amount > balance
            }
            else
            {
                this.balance -= withdrawal;     //If amount< balance, do function
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
