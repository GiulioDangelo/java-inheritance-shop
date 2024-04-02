package org.experis.inheritanceShop;

import java.math.BigDecimal;

public class Smarphone extends Prodotto{

    private int imei;
    private int ram;

    public Smarphone(String name, String brand, BigDecimal price, boolean card, int imei, int ram) {
        super(name, brand, price, card);
        this.imei = imei;
        this.ram = ram;
        applyDiscount();
    }

    @Override
    public String getAllDetails() {
        String details = super.getAllDetails();
        details += "imei: " + imei + "\n";
        details += "ram: " + ram + "\n";
        return details;
    }

    @Override
    public BigDecimal applyDiscount() {
        super.applyDiscount();
        BigDecimal price = getFullPrice();

        if (ram < 32) {
            BigDecimal discount = price.multiply(BigDecimal.valueOf(0.03));
            price = price.subtract(discount);
        }

        return price;
    }
}
