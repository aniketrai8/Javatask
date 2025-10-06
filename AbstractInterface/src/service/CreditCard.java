package Service;
import Interface.Payment;

public class CreditCard implements Payment{
    public void pay(double amount){
        System.out.println("Payment done using credit card: "+amount);
    }

    public void transcationDetails(){
        System.out.println("Transctional details of RUPAY credit card");
    }
}
