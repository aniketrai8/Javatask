package Utility;

public final class Ops{

    public static final double Pi=3.14;

    public static int add(int a,int b){
        return a+b;
    }
    public static int subtract(int a,int b){
        return a-b;
    }
    public static int multiply(int a ,int b){
        return a*b;
    }
    public static int square(int a){
        return a*a;
    }
    public static double areaOfCircle(double radius){
        return Pi*radius*radius;
    }
    public static double areaOfCyclinder(double radius, double height){
        return Pi*radius*radius*height;
    }

    public static double exponential(int power){
        return Math.pow(2,power);
    }

    private Ops(){
        //not to be intailized
    }
}