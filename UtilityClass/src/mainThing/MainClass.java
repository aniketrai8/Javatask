package mainThing;

import Utility.Ops;


public class MainClass{
    public static void main(String[] args){
        System.out.println("Addition of 6 and 10 is: "+Ops.add(6,10));
        System.out.println("Subtraction of 91 and 32 is: "+Ops.subtract(91,32));
        System.out.println("Multiplication of 2 and 16 is: "+Ops.multiply(2,16));
        System.out.println("Square of 8 is: "+Ops.square(8));
        System.out.println("Area of Circle with radius 9 is: "+Ops.areaOfCircle(7));

        System.out.println("Exponential of 2 to the power 16 is : "+Ops.exponential(16));


    }
}