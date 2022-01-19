package pl.edu.uwm.obiektowe.s162430.kolo2;

public class Shoe extends Product{
    String manufacturer;
    String model;

    public Shoe(String name, long id, double price, String manufacturer, String model) {
        super(name, id, price);
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public String toString(){
        return super.toString() + " -> manufacturer: " + this.manufacturer + " -> model: " + this.model;
    }
}
