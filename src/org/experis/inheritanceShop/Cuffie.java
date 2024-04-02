package org.experis.inheritanceShop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean hasCable;

    public Cuffie(String name, String brand, BigDecimal price, boolean card ,String colore, boolean hasCable) {
        super(name, brand, price,card);
        this.colore = colore;
        this.hasCable = hasCable;
        applyDiscount();
    }

    @Override
    public String getAllDetails() {
        String details = super.getAllDetails();
        details += "colore: " + colore + "\n";
        details += "has Cable: " + hasCable + "\n";
        return details;
    }

    @Override
    public BigDecimal applyDiscount() {
        super.applyDiscount();
        BigDecimal price = getFullPrice();

        if (!hasCable) {
            BigDecimal discount = price.multiply(BigDecimal.valueOf(0.05));
            price = price.subtract(discount);
        }

        return price;
    }
}
