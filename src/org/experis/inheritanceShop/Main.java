package org.experis.inheritanceShop;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("quanti prodotti vuoi aggiungere al carrello?");
        int quantity = scan.nextInt();
        scan.nextLine();
        Prodotto[] lista = new Prodotto[quantity];
        int i = 0;

        do {

        System.out.println("stai aggiungendo uno smartphone, un televisore o delle cuffie?");
        String choice = scan.nextLine().toLowerCase();

        switch(choice) {
            case "smartphone":
                System.out.println("inserisci nome");
                String smartphoneName = scan.nextLine();

                System.out.println("inserisci brand");
                String smartphoneBrand = scan.nextLine();

                System.out.println("inserisci prezzo");
                BigDecimal smartphonePrice = scan.nextBigDecimal();

                System.out.println("inserisci imei");
                int imei = scan.nextInt();

                System.out.println("inserisci ram");
                int ram = scan.nextInt();

                scan.nextLine();

                Smarphone phone = new Smarphone(smartphoneName,smartphoneBrand,smartphonePrice,imei,ram);
                lista[i] = phone;
                i++;
                break;
            case "televisore":
                System.out.println("inserisci nome");
                String tvName = scan.nextLine();

                System.out.println("inserisci brand");
                String tvBrand = scan.nextLine();

                System.out.println("inserisci prezzo");
                BigDecimal tvPrice = scan.nextBigDecimal();

                System.out.println("inserisci dimensione");
                int size = scan.nextInt();

                scan.nextLine();

                System.out.println("inserisci smart o no");
                boolean isSmart = scan.nextBoolean();

                Televisori tv = new Televisori(tvName,tvBrand,tvPrice,size,isSmart);
                lista[i] = tv;
                i++;
                break;
            case "cuffie":
                System.out.println("inserisci nome");
                String headphonesName = scan.nextLine();

                System.out.println("inserisci brand");
                String headphonesBrand = scan.nextLine();

                System.out.println("inserisci prezzo");
                BigDecimal headphonesPrice = scan.nextBigDecimal();

                System.out.println("inserisci colore");
                String color = scan.nextLine();

                scan.nextLine();

                System.out.println("inserisci cavo o no");
                boolean hasCable = scan.nextBoolean();

                Cuffie headphones = new Cuffie(headphonesName,headphonesBrand,headphonesPrice,color,hasCable);
                lista[i] = headphones;
                i++;
                break;
            default:
                System.out.println("errore");
        }
        }while (i < lista.length);

        for (Prodotto prodotto : lista) {
            System.out.println(prodotto.getAllDetails());
        }
    }
}
