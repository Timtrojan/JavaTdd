package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositTest(){
        //given
        Account deborahAccount = new Account();

        //when i deposit 5000
        deborahAccount.deposit(5000);

        //check if balance is 5000

        int deborahAccountBalance= deborahAccount.getBalance();

        //assert that it works. using asserEquals from Junit library
        assertEquals(5000, deborahAccountBalance);
    }
    @Test
    public void depositTwiceTest(){
 //given there is an account

        Account deborahAccount= new Account();

        // given that initial balance is 4000

        deborahAccount.deposit(4000);
        // when i deposit 2000
        deborahAccount.deposit(2000);
        //check that balance is 6000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(6000, deborahAccountBalance);
    }
@Test
    public void depositNegativeAmountTest(){
    //given there is an account

    Account deborahAccount= new Account();

    // given that initial balance is 4000

    deborahAccount.deposit(4000);
    // when i deposit 2000
    deborahAccount.deposit(-2000);
    //check that balance is 4000
    int deborahAccountBalance = deborahAccount.getBalance();
    assertEquals(4000, deborahAccountBalance);



}
@Test

    public void withdrawalTest () {

        //Given that there is an account

    Account timothyAccount = new Account();
    //Given that balance is not zero by depositing
    timothyAccount.deposit(5000);

    //When i withdraw 3000, whats the balance
    timothyAccount.withdraw(3000);
    int timothyAccountBalance = timothyAccount.getBalance();

    // check if balance corresponds after withdrawal

    assertEquals(2000,timothyAccountBalance );






}
@Test
    public void withdrawalTestForLowBalance(){

    //Given that there is an account

    Account timothyAccount = new Account();
    //Given that balance is not zero by depositing
    timothyAccount.deposit(1000);

    //When i withdraw 3000, whats the balance
    timothyAccount.withdraw(3000);
    int timothyAccountBalance = timothyAccount.getBalance();

    // check if balance corresponds after withdrawal

    assertEquals(1000,timothyAccountBalance );

}
@Test
    public void negativeWithdrawalAmount(){
    Account timothyAccount= new Account();

    timothyAccount.deposit(2000);
    timothyAccount.withdraw(-1000);
    int timothyAccountBalance= timothyAccount.getBalance();
    assertEquals(2000,timothyAccountBalance);



}

}