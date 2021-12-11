package pl.imiajd.kierklo;

import java.time.LocalDate;

public abstract class Instrument {
    String producent;
    LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }


    public String getProducent(){
        return producent;
    }

    public LocalDate getRokProdukcji(){
        return rokProdukcji;
    }

    public abstract String dzwiek();

    @Override
    public boolean equals(Object obj){
        return this.toString().equals(obj.toString());
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+", producent: "+this.producent+", data produkcji: "+this.rokProdukcji;
    }


}
