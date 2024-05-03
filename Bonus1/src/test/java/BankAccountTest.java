
import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount(1000.0, 0.05);
    }

    @Test public void testIfTheDepositIsPositive() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }
    @Test public void testIfDepositIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-500.0));
    }

    @Test public void testPositiveWithdraw() {
        account.withdraw(500.0);
        assertEquals(500.0, account.getBalance());
    }
    @Test public void testNegativeWithdraw() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-500.0));
    }
    @Test public void testWithdrawNull() {
        assertThrows(IllegalStateException.class, () -> account.withdraw(1500.0));
    }

    @Test public void testTransfer() {
        BankAccount otherAccount = new BankAccount(2000.0, 0.05);
        account.transfer(500.0, otherAccount);
        assertEquals(500.0, account.getBalance());
        assertEquals(2500.0, otherAccount.getBalance());
    }
    @Test public void testTransferNull() {
        assertThrows(NullPointerException.class, () -> account.transfer(500.0, null));
    }

    @Test public void testAddInterest() {
        account.addInterest();
        assertEquals(1050.0, account.getBalance());
    }
}

