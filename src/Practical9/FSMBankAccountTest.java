package Practical9;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.Parameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class FSMBankAccountTest {

    @Test
    @Parameters({
        "addMoney, 100, present, 100", // Add money to an empty account
        "withdrawMoney, 50, present, 50", // Withdraw money from account with balance
        "withdrawMoney, 150, overdrawn, -500", // Withdraw more than the balance
        "withdrawMoney, 100, overdraft, -500", // Withdraw exactly the balance
        "addMoney, -600, overdrawn, -500" // Add money beyond overdraft limit
    })
    public void testProcessEvent(AccountEvents eventToDo, int amount, AccountStates expectedState, int expectedBalance) {
        FSMBankAccount account = new FSMBankAccount(-500, 0, AccountStates.empty);
        account.processEvent(eventToDo, amount);
        assertEquals(expectedState, account.getCurrentState());
        assertEquals(expectedBalance, account.getCurrentBalance());
    }
}
