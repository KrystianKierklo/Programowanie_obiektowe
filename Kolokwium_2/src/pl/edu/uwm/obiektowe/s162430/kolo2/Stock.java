package pl.edu.uwm.obiektowe.s162430.kolo2;

import java.util.ArrayList;

public class Stock {
    ArrayList<Product> products = new ArrayList<Product>();
    float discount = 0;

    public Stock(ArrayList<Product> products, float discount) {
        this.products = products;
        this.discount = discount;
    }

    final boolean addProduct(Product p){
        for(Product pro: products){
            if(pro.getId() == p.getId()){
                return false;
            }
            else{
                products.add(p);
            }
        }
        return true;
    }

    public void applyDiscount(float d){
        if(d <= 50){
            for(Product p: products){
                p.setPrice(1-d/100);
            }
        }
    }

    public double getTotalValue(){
        double suma = 0;;
        for(Product p: products){
            suma += p.getPrice();
        }
        return suma;
    }


}
