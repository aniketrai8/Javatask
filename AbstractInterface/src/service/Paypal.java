
package Service;

import Interface.Payment;

public class Paypal implements Payment {
    public void pay(double amount){
        System.out.println("Payment done using Paypal: "+amount);
    }

    public void transcationDetails(){
        System.out.println("Transcational details of Paypal");
    }

}