package com.bank.product.card;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.Assert.*;

public class CreditCardTest {

    @Test
    public void testGetInterestRate() {
        Currency currency = Currency.getInstance("USD");
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";
        double interestRate = 0.05;

        CreditCard creditCard = new CreditCard(currency, balance, name, interestRate);
        Assert.assertEquals(interestRate, creditCard.getInterestRate(), 0.0001);
    }

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
}