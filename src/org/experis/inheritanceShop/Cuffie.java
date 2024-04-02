package org.experis.inheritanceShop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean hasCable;

    public Cuffie(String name, String brand, BigDecimal price, String colore, boolean hasCable) {
        super(name, brand, price);
        this.colore = colore;
        this.hasCable = hasCable;
    }

    @Override
    public String getAllDetails() {
        String details = super.getAllDetails();
        details += "colore: " + colore + "\n";
        details += "has Cable: " + hasCable + "\n";
        return details;
    }
}
