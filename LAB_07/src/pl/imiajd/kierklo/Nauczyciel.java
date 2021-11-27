package pl.imiajd.kierklo;

public class Nauczyciel extends Osoba {
    private double pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public double getPensja(){
        return this.pensja;
    }


    @Override
    public String toString(){
        return ("\nNazwisko: " + super.getNazwisko() + "   rok urodzenia: " + super.getRokUrodzenia() + "   pensja: " + this.pensja);
    }
}
