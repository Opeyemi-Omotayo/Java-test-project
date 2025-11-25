package com.exceptionhandling;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public String toString() {
        return currency + " " + amount;
    }

    public boolean addAmount(Amount that) {
        if(!currency.equals(that.currency)) throw new RuntimeException("Currency has wrong value");

        this.amount += that.amount;
        return false;
    }

}

public class ThrowingExceptionRunner {
    static void main() {
       Amount amount1 = new Amount("USD", 100);
       Amount amount2 = new Amount("EUR", 200);
       Amount amount3 = new Amount("GBP", 300);

        System.out.println(amount1.addAmount(amount2));
    }
}
