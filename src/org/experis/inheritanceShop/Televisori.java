package org.experis.inheritanceShop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{
    private int size;
    private boolean isSmart;

    public Televisori(String name, String brand, BigDecimal price, boolean card, int size, boolean isSmart) {
        super(name, brand, price, card);
        this.size = size;
        this.isSmart = isSmart;
        applyDiscount();
    }

    @Override
    public String getAllDetails() {
        String details = super.getAllDetails();
        details += "Size: " + size + "\n";
        details += "Is Smart: " + isSmart + "\n";
        return details;
    }

    @Override
    public BigDecimal applyDiscount() {
        super.applyDiscount();
        BigDecimal price = getFullPrice();

        if (!isSmart) {
            BigDecimal discount = price.multiply(BigDecimal.valueOf(0.08));
            price = price.subtract(discount);
        }

        return price;
    }
}
