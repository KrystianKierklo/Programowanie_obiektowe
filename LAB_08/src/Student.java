import java.time.LocalDate;

class Student extends Osoba {

    private String kierunek;
    private double sredniaOcen;

    public Student(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, String kierunek, double sredniaOcen) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen(){
        return sredniaOcen
    }


    public String getOpis() {
        return "kierunek studiów: " + kierunek;
    }
}
