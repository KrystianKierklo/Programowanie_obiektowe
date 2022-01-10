package pl.imiajd.kierklo;

import pl.imiajd.kierklo.Osoba;
import pl.imiajd.kierklo.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;


public class TestOsoba {
    public static void main(String[] args){

        ArrayList<Osoba> grupa = new ArrayList<>();

        grupa.add(new Osoba("Kierklo", LocalDate.of(1977,6,11)));
        grupa.add(new Osoba("Kierklo", LocalDate.of(1975,2,2)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(2005,10,10)));
        grupa.add(new Osoba("Nowak", LocalDate.of(2005,10,10)));
        grupa.add(new Osoba("Kierklo", LocalDate.of(2001,11,12)));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
        System.out.println("\n");



        ArrayList<Student> studia = new ArrayList<>();

        studia.add(new Student("Marciniak", LocalDate.of(1999,6,15), 4.5));
        studia.add(new Student("Marciniak", LocalDate.of(1999,6,15), 5.0));
        studia.add(new Student("Rutkowski", LocalDate.of(2000,5,10), 3.5));
        studia.add(new Student("Skrocki", LocalDate.of(1998,2,2), 5.0));
        studia.add(new Student("Kierklo", LocalDate.of(2001,11,12), 4.0));

        System.out.println(studia);
        Collections.sort(studia);
        System.out.println(studia);
    }
}
