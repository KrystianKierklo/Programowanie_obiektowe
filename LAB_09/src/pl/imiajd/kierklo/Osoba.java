package pl.imiajd.kierklo;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }


    @Override
    public String toString(){
        return getClass().getName() + "-->[" + this.nazwisko + "-->" + this.dataUrodzenia + "]";
    }


    @Override
    public boolean equals(Object object){
        Osoba osoba1 = (Osoba) object;
        return (osoba1.nazwisko.equals(this.nazwisko) && osoba1.dataUrodzenia.equals(this.dataUrodzenia));
    }

    @Override
    public int compareTo(Osoba osoba2) {
        int nazw = this.nazwisko.compareTo(osoba2.nazwisko);
        if(nazw == 0){
            return this.dataUrodzenia.compareTo(osoba2.dataUrodzenia);
        }
        return nazw;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }
    public LocalDate getDataUrodzenia(){
        return this.dataUrodzenia;
    }

}
