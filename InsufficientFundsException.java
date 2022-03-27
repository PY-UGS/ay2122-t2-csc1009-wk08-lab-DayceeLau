import java.io.*;

public class InsufficientFundsException extends Exception{
    private double amount;
    private String error;


    public InsufficientFundsException(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }

    InsufficientFundsException(String error){
        this.error = error;
    }
    @Override
    public String toString(){
        return this.error;
    }

}
