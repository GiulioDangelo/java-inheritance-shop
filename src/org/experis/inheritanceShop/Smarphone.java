package org.experis.inheritanceShop;

import java.math.BigDecimal;

public class Smarphone extends Prodotto{

    private int imei;
    private int ram;

    public Smarphone(String name, String brand, BigDecimal price, int imei, int ram) {
        super(name, brand, price);
        this.imei = imei;
        this.ram = ram;
    }

    @Override
    public String getAllDetails() {
        String details = super.getAllDetails();
        details += "imei: " + imei + "\n";
        details += "ram: " + ram + "\n";
        return details;
    }
}
