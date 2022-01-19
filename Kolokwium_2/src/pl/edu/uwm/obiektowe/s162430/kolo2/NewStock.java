package pl.edu.uwm.obiektowe.s162430.kolo2;

import java.util.ArrayList;
import java.util.LinkedList;

public class NewStock extends Stock{
    LinkedList<StockPosition> positions = new LinkedList<StockPosition>();

    public NewStock(ArrayList<Product> products, float discount, LinkedList<StockPosition> positions) {
        super(products, discount);
        this.positions = positions;
    }

    public void addPosition(StockPosition sp){

    }
}
