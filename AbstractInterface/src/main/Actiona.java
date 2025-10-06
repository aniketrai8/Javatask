package Main;

import Interface.Payment;
import Service.Paypal;
import Service.UPI;
import Service.CreditCard;

import java.util.Scanner;

public class Actiona{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Choose one of the Three Payment Methods: UPI, Paypal, Credit Card");
        String method= scanner.nextLine();

        Payment payment;

        switch(method){
            case "UPI" ->payment= new UPI();
            case "Paypal" ->payment= new Paypal();
            case "Credit Card"->payment= new CreditCard();
            default->{
                System.out.println("Choose a valid payment method");
                return;
            }
        }

        System.out.println("Enter the amount: ");
        double amount= scanner.nextDouble();

        payment.pay(amount);
        payment.transcationDetails();


    }
}