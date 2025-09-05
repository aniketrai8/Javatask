package Main;


public class Mock {
    private  String accNumber;
    private double balance;

    public Mock(String accNumber,double balance){
        this.accNumber= accNumber;
        this.balance= balance;
    }

    public double getBalance(){
        return balance;

    }
    public void deposit(double amount){
        if(amount <=0){
            throw new IllegalArgumentException("deposit amount should be greater than zero");
        }
        balance+=amount;
    }

    public void withdrawal(double amount){
        if(amount <=0){
            throw new IllegalArgumentException("Withdrawal amount should be grater than zero");
        }
        if(balance < amount){
            throw new IllegalArgumentException("Balance Insufficient");
        }
        balance-=amount;
    }
}
