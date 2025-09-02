package Service;

import Interface.Payment;

public class UPI implements Payment{
    public void pay(double amount){
        System.out.println("Payment done using UPI: "+amount);
    }

    public void transcationDetails(){
        System.out.println("Transcational details of UPI");
    }
}