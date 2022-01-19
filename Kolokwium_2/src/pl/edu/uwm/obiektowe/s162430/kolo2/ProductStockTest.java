package pl.edu.uwm.obiektowe.s162430.kolo2;

import java.util.ArrayList;

public class ProductStockTest {
    public static void main(String[] args){
        ArrayList<Product> produkty = new ArrayList<>();
        Stock stock = new Stock(produkty, 0);


        Product shoe1 = new Shoe("buty", 10, 349, "Adidas", "ultraboost");
        Product shoe2 = new Shoe("buty", 10, 399, "Nike", "AirForce");

        Product shirt1 = new Shirt("Koszulka", 55, 79, "Champion", "Medium", true);
        Product shirt2 = new Shirt("Koszulka", 40, 59, "Bershka", "Medium", true);


        stock.addProduct(shoe1);
        stock.addProduct(shoe2);
        stock.addProduct(shirt1);
        stock.addProduct(shirt2);

        System.out.println(stock.getTotalValue());
        stock.applyDiscount(15);
        System.out.println(stock.getTotalValue());
        stock.applyDiscount(40);
        System.out.println(stock.getTotalValue());


        }
    }
