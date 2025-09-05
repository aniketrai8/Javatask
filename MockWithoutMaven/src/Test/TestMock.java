package Test;
import Main.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMock {
     private Mock acc;
    @BeforeEach
    void setUp(){
        acc = new Mock("101",1000);

    }
    @Test
    void testInitialBalance(){
        assertEquals(1000,acc.getBalance());
    }
    @Test
    void testDeposit(){
        acc.deposit(700);
        assertEquals(1700,acc.getBalance());
    }
    @Test
    void withdrawal(){
        acc.withdrawal(500);
        assertEquals(500,acc.getBalance());

        }

        @Test
    void moreWithdrawal() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                acc.withdrawal(2300);
            });
            assertEquals("Balance Insufficient", exception.getMessage());
        }

        @Test
    void negativeDeposit(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->{
            acc.deposit(-900);

            });
        assertEquals("deposit amount should be greater than zero",exception.getMessage());
        }

        @Test
    void testNegativeWithdrawal(){
        Exception exception = assertThrows(IllegalArgumentException.class,()-> {
                    acc.withdrawal(-800);
                });
            assertEquals("Withdrawal amount should be grater than zero",exception.getMessage());
        }
        }


