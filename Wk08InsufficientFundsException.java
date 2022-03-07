import java.io.*;

public class Wk08InsufficientFundsException extends Exception{
    private double amount;
    private String error;


    public Wk08InsufficientFundsException(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }

    Wk08InsufficientFundsException(String error){
        this.error = error;
    }
    @Override
    public String toString(){
        return this.error;
    }

}
