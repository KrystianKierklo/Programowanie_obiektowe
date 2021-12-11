package pl.imiajd.kierklo;

import pl.imiajd.kierklo.Flet;
import pl.imiajd.kierklo.Fortepian;
import pl.imiajd.kierklo.Instrument;
import pl.imiajd.kierklo.Skrzypce;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        orkiestra.add(new Flet("Altus", LocalDate.of(2000,10,10)));
        orkiestra.add(new Flet("Yamaha", LocalDate.of(2010,10,10)));
        orkiestra.add(new Skrzypce("Forenza", LocalDate.of(1990,10,10)));
        orkiestra.add(new Fortepian("Yamaha", LocalDate.of(2018,10,10)));
        orkiestra.add(new Skrzypce("Harald Lorenz", LocalDate.of(1992,10,10)));

        for(Instrument p: orkiestra){
            System.out.print(p.dzwiek() + " -----> ");
            System.out.println(p);
        }
    }
}
