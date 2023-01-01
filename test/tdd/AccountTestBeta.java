package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTestBeta {

    @Test
    public void testThatAccountClassCanBeCreated() {
        AccountBeta newAccount = new AccountBeta(1000.00, "Timothy", "5555");
        assertNotNull(newAccount);
    }

    @Test
    public void testThatMethodCanDepositInAccount() {
        AccountBeta newAccount = new AccountBeta(1000, "Timothy", "5555");
         newAccount.deposit(2000.00);
         double accountStatus= newAccount.getBalance();
         assertEquals(3000.00,accountStatus);
    }

    @Test
    public void testThatAccountClassCanTransfer() {
        AccountBeta newAccount = new AccountBeta(1000, "Timothy", "5555");
        AccountBeta newAccountTwo= new AccountBeta(1000.00,"Shola","6666");
        newAccount.deposit(3000.00);
        AccountBeta.transfer(newAccount, newAccountTwo, 1000.00);
        assertEquals(2000.00, newAccountTwo.getBalance());

    }
}
