package pl.imiajd.kierklo;

import pl.imiajd.kierklo.Osoba;

public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }


    private String getKierunek(){
        return this.kierunek;
    }


    @Override
    public String toString(){
        return ("\nNazwisko: " + super.getNazwisko() + "   rok urodzenia: " + super.getRokUrodzenia() + "   Kierunek: " + this.kierunek);
    }
}
