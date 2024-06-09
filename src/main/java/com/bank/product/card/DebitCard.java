package com.bank.product.card;

import com.bank.product.BaseBankProduct;

import java.math.BigDecimal;
import java.util.Currency;

public class DebitCard extends BaseBankProduct {
    public DebitCard(BigDecimal balance, String name) {
        super(Currency.getInstance("RUB"), balance, name);
    }
}
