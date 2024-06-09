package com.bank.product.deposit;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.Assert.*;

public class CashDepositTest {
    @Test
    public void testIsOpen() {
        Currency currency = Currency.getInstance("USD");
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Deposit";

        CashDeposit cashDeposit = new CashDeposit(currency, balance, name);
        assertTrue(cashDeposit.isOpen());
    }

    @Test
    public void testClose() {
        Currency currency = Currency.getInstance("USD");
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Deposit";

        CashDeposit cashDeposit = new CashDeposit(currency, balance, name);
        cashDeposit.close();
        assertFalse(cashDeposit.isOpen());
    }

    @Test
    public void testRefillBalance() {
        Currency currency = Currency.getInstance("USD");
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Deposit";
        BigDecimal refillAmount = new BigDecimal("-500");

        CashDeposit cashDeposit = new CashDeposit(currency, balance, name);
        assertEquals(balance.add(refillAmount), cashDeposit.refillBalance(refillAmount));
    }
}