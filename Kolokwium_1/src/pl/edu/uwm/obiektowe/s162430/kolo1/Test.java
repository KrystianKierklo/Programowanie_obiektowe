package pl.edu.uwm.obiektowe.s162430.kolo1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
    Pojazd audi = new Pojazd("audi", "a4", 1998, 5000);
    Pojazd vw = new Pojazd("Volkswagen", "Golf", 2017, 65000);
    Pojazd toyota = new Pojazd("Toyota", "RAV4", 2016, 66000);


    Wyposazenie w1 = new Wyposazenie("Xenony", 7500);
    Wyposazenie w2 = new Wyposazenie("Folia", 12000);
    Wyposazenie w3 = new Wyposazenie("Lepsze naglosnienie", 3500);
    Wyposazenie w4 = new Wyposazenie("Felgi", 4500);
    Wyposazenie w5 = new Wyposazenie("Chip Tuning", 3000);

    vw.dodajWyposazenie(w3);
    audi.dodajWyposazenie(w2);
    toyota.dodajWyposazenie(w1);
    vw.dodajWyposazenie(w4);
    audi.dodajWyposazenie(w5);

    ArrayList<Pojazd> garaz = new ArrayList<Pojazd>();

    garaz.add(audi);
    garaz.add(vw);
    garaz.add(toyota);


    for(Pojazd p: garaz){
        System.out.println(p.toString());
    }

    System.out.println("");

    for(Pojazd p: garaz){
        System.out.println("Marka :" + p.getMarka() + "   Model: " + p.getModel() + "   rok prod.: " + p.getDataProdukcji()
        + "   Vin: " + p.getVin() + "   koszt: " + p.getCenaFinalna());
    }

    }
}
