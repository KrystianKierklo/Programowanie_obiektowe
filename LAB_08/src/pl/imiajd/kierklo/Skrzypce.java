package pl.imiajd.kierklo;

import pl.imiajd.kierklo.Instrument;

import java.time.LocalDate;

public class Skrzypce extends Instrument {
    Skrzypce(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    public String dzwiek(){
        return "skrzypce skrzypce skrzypce";
    }
}
