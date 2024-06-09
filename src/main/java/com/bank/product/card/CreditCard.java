package com.bank.product.card;

import com.bank.product.BaseBankProduct;

import java.math.BigDecimal;
import java.util.Currency;

public class CreditCard extends BaseBankProduct {
    private double interestRate;

    public CreditCard(Currency currency, BigDecimal balance, String name, double interestRate) {
        super(currency, balance, name);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public BigDecimal getDebt() {
        return getBalance().compareTo(BigDecimal.ZERO) < 0 ? getBalance() : BigDecimal.ZERO;
    }
}
