package pl.imiajd.kierklo;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String naziwsko, int rokUrodzenia){
        this.nazwisko = naziwsko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }

    public int getRokUrodzenia(){
        return this.rokUrodzenia;
    }
    @Override
    public String toString(){
        return ("Nazwisko: " + this.nazwisko + "   rok urodzenia: " + this.rokUrodzenia);
    }
}
