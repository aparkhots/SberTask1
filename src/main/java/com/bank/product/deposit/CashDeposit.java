package com.bank.product.deposit;

import com.bank.product.BaseBankProduct;

import java.math.BigDecimal;
import java.util.Currency;

public class CashDeposit extends BaseBankProduct {
    private boolean isOpen;

    public CashDeposit(Currency currency, BigDecimal balance, String name) {
        super(currency, balance, name);
        this.isOpen = true;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean close() {
        return this.isOpen = false;
    }


}
