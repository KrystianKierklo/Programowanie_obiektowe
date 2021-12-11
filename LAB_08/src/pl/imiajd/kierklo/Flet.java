package pl.imiajd.kierklo;

import java.time.LocalDate;

public class Flet extends Instrument {
    public Flet(String producnt, LocalDate rokProdukcji){
        super(producnt, rokProdukcji);
    }

    public String dzwiek(){
        return "flet flet flet";
    }
}
