package com.bank.product.card;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.Assert.*;

public class CreditCardTest {

    @Test
    public void testGetDebt() {
        Currency currency = Currency.getInstance("USD");
        BigDecimal balance = new BigDecimal("-500");
        String name = "Test Card";
        double interestRate = 0.05;

        CreditCard creditCard = new CreditCard(currency, balance, name, interestRate);
        assertEquals(balance, creditCard.getDebt());
    }

    @Test
    public void testGetDebtNoDebt() {
        Currency currency = Currency.getInstance("USD");
        BigDecimal balance = new BigDecimal("500");
        String name = "Test Card";
        double interestRate = 0.05;

        CreditCard creditCard = new CreditCard(currency, balance, name, interestRate);
        assertEquals(BigDecimal.ZERO, creditCard.getDebt());
    }

    @Test
    public void testRefillBalance() {
        Currency currency = Currency.getInstance("USD");
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";
        BigDecimal refillAmount = new BigDecimal("500");
        double interestRate = 0.05;

        CreditCard creditCard = new CreditCard(currency, balance, name, interestRate);
        assertEquals(balance.add(refillAmount), creditCard.refillBalance(refillAmount));
    }
}