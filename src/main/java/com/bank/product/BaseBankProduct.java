package com.bank.product;

import java.math.BigDecimal;
import java.util.Currency;

public abstract class BaseBankProduct {
    private Currency currency;
    private BigDecimal balance;
    private String name;

    public BaseBankProduct(Currency currency, BigDecimal balance, String name) {
        this.currency = currency;
        this.balance = balance;
        this.name = name;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal refillBalance(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            return this.balance;
        }
        return this.balance.add(amount);

    }
}
