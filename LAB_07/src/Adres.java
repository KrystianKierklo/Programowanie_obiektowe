public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania = -10;
    private String miasto;
    private int kod_pocztowy;



    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, int kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;


    }

    public Adres(String ulica, int numer_domu, String miasto, int kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){
        if(this.numer_mieszkania == -10){
            System.out.printf("\nNazwa ulicy: " + this.ulica + "    Numer domu: " + this.numer_domu);
        }
        else{
            System.out.printf("\n Nazwa ulicy: " + this.ulica + "    Numer domu: " + this.numer_domu + " Numer mieszkania: " + this.numer_mieszkania);
        }
    }


}
