import java.lang.Math;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class CircleWithException {
    private double radius;
    private static double maxArea = 1000;

    public CircleWithException(double radius) throws Exception{
        this.radius = radius;
        if(radius<=0){
            throw new IllegalArgumentException("Das illegal, negative or 0 not allowed.");
        }else if(radius>CircleWithException.maxArea){
            throw new Exception("Radius too big, can't pick a radius more than 1000");
        }
    }

    public void setRadius(double radius)throws Exception{
        this.radius = radius;
        if(radius<=0){
            throw new IllegalArgumentException("Das illegal, negative radius not allowed.");
        }else if(radius>CircleWithException.maxArea){
            throw new Exception("Radius too big, can't pick a radius more than 1000");
        }
    }
    public double getRadius(){return this.radius;}
    
    public double getArea()throws Exception{
        double AoC = Math.PI*this.radius*this.radius;
        if (AoC > maxArea){
            throw new Exception("General Exception");
        }else{
            return AoC;
        }
    }

    public double getDiameter(){
        return(2*Math.PI*this.radius);
    }

    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            CircleWithException Circle = null;
            System.out.print("Radius of circle: ");
            double radius = scan.nextDouble();
            Circle = new CircleWithException(radius);
            System.out.println("Area of circle: " + Circle.getArea());
            System.out.println("Diameter of circle: " + Circle.getDiameter());

        }catch(Exception exceptions){System.out.println(exceptions);}
    }
}
