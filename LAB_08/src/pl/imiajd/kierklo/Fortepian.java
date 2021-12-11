package pl.imiajd.kierklo;

import java.time.LocalDate;

public class Fortepian extends Instrument {
    public Fortepian(String producent, LocalDate rokProduckji){
        super(producent, rokProduckji);
    }

    public String dzwiek(){
        return"fortepian fortepian fortepian";
    }
}
