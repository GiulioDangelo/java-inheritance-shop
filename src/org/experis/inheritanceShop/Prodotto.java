package org.experis.inheritanceShop;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int id;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva = BigDecimal.valueOf(0.22);
    private boolean card;


    Random rand = new Random();
    Prodotto(String name, String brand, BigDecimal price, boolean card) {
        id = rand.nextInt(100000000);

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.card = card;

        applyDiscount();
    }


    public BigDecimal getBasePrice() {
        return price;
    }

    public BigDecimal getFullPrice() {
        BigDecimal ivaAmount = price.multiply(iva);
        BigDecimal totalPrice = price.add(ivaAmount);
        return totalPrice.setScale(2, RoundingMode.HALF_UP);
    }

    public String getFullName() {
       return String.format("%08d", id) + "-" + name;
    }

    public String getAllDetails(){
        String details = "id: " + id + "\nnome: " + name + "\nbrand: " + brand + "\nprice: " + price + "\niva: " + iva + "\n";
        return details;
    }

    public BigDecimal applyDiscount() {
        if (card) {
            BigDecimal discount = price.multiply(BigDecimal.valueOf(0.02));
            price = price.subtract(discount);
            return price;
        } else {
            return price;
        }
    }
}
