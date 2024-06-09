package com.bank.product.card;

import com.bank.product.BaseBankProduct;

import java.math.BigDecimal;
import java.util.Currency;

public class CurrencyDebitCard extends BaseBankProduct {
    public CurrencyDebitCard(Currency currency, BigDecimal balance, String name) {
        super(currency, balance, name);
    }
}
