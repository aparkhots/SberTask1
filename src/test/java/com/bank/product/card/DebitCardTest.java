package com.bank.product.card;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.Assert.*;

public class DebitCardTest {

    @Test
    public void testRefillBalance() {
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";
        BigDecimal refillAmount = new BigDecimal("500");

        DebitCard debitCard = new DebitCard(balance, name);
        assertEquals(balance.add(refillAmount), debitCard.refillBalance(refillAmount));
    }

}