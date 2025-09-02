import java.io.*;

public class Unchecked {
    public static void main(String [] args){
       try{
           int result= divide(10,0);
           System.out.println("Result : "+result);

       }catch(ArithmeticException e){
           System.out.println("Displaying Arithmetic exceptions : "+e.getMessage());

       }

       try{
           String text = null;
           System.out.println(text.length());

       }catch(NullPointerException f){
           System.out.println(" Displaying a NullPointerError : "+f.getMessage());
       }
    }

    public static int divide(int a, int b){
        return a/b;
    }
}
