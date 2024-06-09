package com.bank.product.card;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.Assert.*;

public class CurrencyDebitCardTest {

    @Test
    public void testRefillBalance() {
        Currency currency = Currency.getInstance("USD");
        BigDecimal balance = new BigDecimal("1000");
        String name = "Test Card";
        BigDecimal refillAmount = new BigDecimal("500");

        CurrencyDebitCard debitCard = new CurrencyDebitCard(currency, balance, name);
        assertEquals(balance.add(refillAmount), debitCard.refillBalance(refillAmount));
    }

}