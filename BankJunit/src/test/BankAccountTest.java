package Test;
import Main.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp(){
        account = new BankAccount("1097",2000);
    }

    @Test
   void testIntialBalance(){
        assertEquals(2000.0,account.getBalance());

    }

    @Test
    void testDeposit(){
        account.deposit(500);
        assertEquals(1500.0,account.getBalance());

    }

    @Test
    void testWithdraw(){
        account.withdraw(1000);
        assertEquals(1000.0,account.getBalance());
    }

    @Test
    void testWithdrawMoreThanBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000);
        });
        assertEquals("Insufficient balance", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100);
        });
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }


}
