package pl.edu.uwm.obiektowe.s162430.kolo2;

public abstract class Product {
    public String name;
    public long id;
    public double price;

    public Product(String name, long id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Product: " + "name: " + this.name + " -> id: " + this.id + " -> price: " + this.price;
    }
}
