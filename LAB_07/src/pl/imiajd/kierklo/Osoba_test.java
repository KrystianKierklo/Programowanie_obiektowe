package pl.imiajd.kierklo;

import pl.imiajd.kierklo.Nauczyciel;
import pl.imiajd.kierklo.Osoba;

public class Osoba_test {
    public static void main(String[] args){
        Osoba pierwsza = new Osoba("Riccardi", 2000);
        Osoba druga = new Osoba("Tupek", 2003);

        System.out.println(pierwsza.toString());

        Student s1 = new Student("Brzoza", 1999, "Informatyka");
        System.out.println(s1.toString());

        Nauczyciel n1 = new Nauczyciel("Matman", 1964, 5600.50);
        System.out.println(n1.toString());

    }
}
