package pl.imiajd.kierklo;

import pl.imiajd.kierklo.Pracownik;

import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan"}, LocalDate.of(1975,2,2),
                false, 7500, LocalDate.of(2008, 10, 10));

        ludzie[1] = new Student("Nowak", new String[]{"Małgorzata"}, LocalDate.of(2000, 5, 16),
                true,  "informatyka", 5.0);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}