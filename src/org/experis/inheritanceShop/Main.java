package org.experis.bonus2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto mela = new Prodotto("mela","verde", BigDecimal.valueOf(1.50));

        System.out.println(mela.getFullPrice());
        System.out.println(mela.getFullName());
        System.out.println(mela.getAllDetails());

        Prodotto pera = new Prodotto("pera","gialla",BigDecimal.valueOf(2.10));

        System.out.println(pera.getFullPrice());
        System.out.println(pera.getFullName());
        System.out.println(pera.getAllDetails());
    }
}
