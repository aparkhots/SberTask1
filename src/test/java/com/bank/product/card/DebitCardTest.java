package com.bank.product.card;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DebitCardTest {

    @Test
    public void testRefillBalance_WithZeroAmount() {
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";
        BigDecimal refillAmount = new BigDecimal("0");

        DebitCard debitCard = new DebitCard(balance, name);
        assertEquals(balance, debitCard.refillBalance(refillAmount));
    }

    @Test
    public void testRefillBalance_WithNullAmount() {
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";

        DebitCard debitCard = new DebitCard(balance, name);
        assertThrows(NullPointerException.class, () -> debitCard.refillBalance(null));
    }

    @Test
    public void testRefillBalance_WithNegativeAmount() {
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";
        BigDecimal refillAmount = new BigDecimal("-500");

        DebitCard debitCard = new DebitCard(balance, name);
        assertEquals(balance, debitCard.refillBalance(refillAmount));
    }

}