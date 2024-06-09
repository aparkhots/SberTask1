package com.bank.product.card;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.Assert.*;

public class DebitCardTest {
    @Test
    public void testGetCurrency() {
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";

        DebitCard debitCard = new DebitCard(balance, name);
        assertEquals(Currency.getInstance("RUB"), debitCard.getCurrency());
    }

    @Test
    public void testGetBalance() {
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";

        DebitCard debitCard = new DebitCard(balance, name);
        assertEquals(balance, debitCard.getBalance());
    }

    @Test
    public void testGetName() {
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";

        DebitCard debitCard = new DebitCard(balance, name);
        assertEquals(name, debitCard.getName());
    }

    @Test
    public void testRefillBalance() {
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";
        BigDecimal refillAmount = new BigDecimal("500");

        DebitCard debitCard = new DebitCard(balance, name);
        assertEquals(balance.add(refillAmount), debitCard.refillBalance(refillAmount));
    }

}