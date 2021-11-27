package pl.imiajd.kierklo;

import pl.imiajd.kierklo.BetterRectangle;

public class BetterRectangle_test {

    public static void main(String[] args){
        BetterRectangle prostokat1 = new BetterRectangle(10,15,0,0);

        System.out.println("Obwod prostokowa wynosi: " + prostokat1.getPerimeter());
        System.out.println("Pole prostokata wynosi: " + prostokat1.getArea());
    }
}
