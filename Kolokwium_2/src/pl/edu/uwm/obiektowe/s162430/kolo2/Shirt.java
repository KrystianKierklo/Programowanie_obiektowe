package pl.edu.uwm.obiektowe.s162430.kolo2;

public class Shirt extends Product {
    String manufacturer;
    String size;
    boolean slimFit;

    public Shirt(String name, long id, double price, String manufacturer, String size, boolean slimFit) {
        super(name, id, price);
        this.manufacturer = manufacturer;
        this.size = size;
        this.slimFit = slimFit;
    }

    @Override
    public String toString(){
        return super.toString() + " -> manufacturer: " + this.manufacturer + " -> size: " + this.size + " -> slimfim: " + this.slimFit;
    }
}
