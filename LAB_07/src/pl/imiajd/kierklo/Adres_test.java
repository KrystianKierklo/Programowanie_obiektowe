package pl.imiajd.kierklo;

import pl.imiajd.kierklo.Adres;

import java.lang.String;

public class Adres_test {
    public static void main(String[] args){
        Adres pierwszy = new Adres("Plac Konsulatu Polskiego", 6, 1,"Olsztyn", "10-699");
        Adres drugi = new Adres("Armii krajowej", 10, "Olsztyn", "11-051");

        pierwszy.pokaz();
        drugi.pokaz();
        System.out.println("\n" + pierwszy.przed(drugi.getKod_pocztowy()));


    }
}
