package pl.imiajd.kierklo;

import java.lang.String;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania = -10;
    private String miasto;
    private String kod_pocztowy;



    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getKod_pocztowy(){
        return this.kod_pocztowy;
    }

    public void pokaz(){
        if(this.numer_mieszkania == -10){
            System.out.println("\nKod pocztowy: " + this.kod_pocztowy + "   Miasto: " + this.miasto);
            System.out.println("Ulica: " + this.ulica + "   Numer domu: " + this.numer_domu);

        }
        else{
            System.out.println("Kod pocztowy: " + this.kod_pocztowy + "   Miasto: " + this.miasto);
            System.out.println("Ulica: " + this.ulica + "   Numer domu: " + this.numer_domu + "   Numer mieszkania: " + this.numer_mieszkania);
        }
    }

    public boolean przed(String kod){
        int kod1 = Integer.parseInt(this.kod_pocztowy.replace("-",""));
        int kod2 = Integer.parseInt(kod.replace("-",""));
        if (kod1 < kod2){
            return true;
        }
        else{
            return false;
        }
    }

}
