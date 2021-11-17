package pl.edu.uwm.obiektowe.s162430.kolo1;

import java.util.ArrayList;

public class Pojazd {
    private String marka;
    private String model;
    private int dataProdukcji;
    private double cenaBazowa;
    private String vin;


    public Pojazd(String marka, String model, int dataProdukcji, double cenaBazowa){
        this.marka = marka;
        this.model = model;
        this.dataProdukcji = dataProdukcji;
        this.cenaBazowa = cenaBazowa;
    }

    public void setMarka(String marka){
        this.marka = marka;
    }
    public String getMarka(){
        return marka;
    }


    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }



    public int getDataProdukcji(){
        return dataProdukcji;
    }


    public void setCenaBazowa(double cenaBazowa){
        this.cenaBazowa = cenaBazowa;
    }
    public double getCenaBazowa(){
        return cenaBazowa;
    }


    public void setVin(String vin){
        boolean litery = true;
        for(int i=0; i<vin.length(); i++){
            if(vin.charAt(i) != 'I' && vin.charAt(i)!= 'O' && vin.charAt(i)!= 'Q'){
                litery = true;
            }
            else{
                litery = false;
            }
        }
        if(vin.length() == 17 && litery == true){
            this.vin = vin;
        }
        else{
            System.out.println("Wprowadzono niepoprawny numer VIN!");
        }
    }

    public String getVin(){
        return vin;
    }


    public int wiek(){
        return 2021 - dataProdukcji;
    }

    ArrayList<Wyposazenie> wyposazenie = new ArrayList<Wyposazenie>();

    public void dodajWyposazenie(Wyposazenie w){
        wyposazenie.add(w);
    }


    public String toString(){
        return "Pojazd marki " + this.marka + ", model: " + this.model + ", wyprodukowany w roku: " + this.dataProdukcji;
    }


    public double getCenaFinalna(){
        return this.cenaBazowa ;
    }

}
