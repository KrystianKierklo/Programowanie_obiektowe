package pl.imiajd.kierklo;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public int compareTo(Osoba osoba1) {
        int result = super.compareTo(osoba1);
        double srednia = ((Student) osoba1).sredniaOcen;
        if (result == 0) {
            if (this.sredniaOcen < srednia)
                return 1;
            if (this.sredniaOcen > srednia)
                return -1;
        }
        return result;
    }

    @Override
    public String toString(){
        return getClass().getName() + "-->[" + this.getNazwisko() + "-->" + this.getDataUrodzenia() + "-->"
                + "|" + this.sredniaOcen + "|" + "]";
    }


}

