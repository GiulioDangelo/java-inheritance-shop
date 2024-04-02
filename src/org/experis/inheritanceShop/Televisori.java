package org.experis.inheritanceShop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{
    private int size;
    private boolean isSmart;

    public Televisori(String name, String brand, BigDecimal price, int size, boolean isSmart) {
        super(name, brand, price);
        this.size = size;
        this.isSmart = isSmart;
    }

    @Override
    public String getAllDetails() {
        String details = super.getAllDetails();
        details += "Size: " + size + "\n";
        details += "Is Smart: " + isSmart + "\n";
        return details;
    }
}
