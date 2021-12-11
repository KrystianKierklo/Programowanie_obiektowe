package pl.imiajd.kierklo;

import java.time.LocalDate;

abstract class Osoba {

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;


    public Osoba(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec) {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko() {
        return nazwisko;
    }

    public String[] getImiona(){
        return imiona;
    }

    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }

}