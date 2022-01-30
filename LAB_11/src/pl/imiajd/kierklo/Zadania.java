import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Zadania {
    public static void main(String[] args){
        LinkedList<String> lista_pracownikow = new LinkedList<>();
        lista_pracownikow.add("Kowalski");
        lista_pracownikow.add("Nowak");
        lista_pracownikow.add("Shrek");
        lista_pracownikow.add("Banach");
        lista_pracownikow.add("Strzelecki");
        lista_pracownikow.add("Kędzior");
        lista_pracownikow.add("Potocki");
        lista_pracownikow.add("Duda");
        lista_pracownikow.add("Zenek");
        lista_pracownikow.add("Choinka");


        System.out.println(lista_pracownikow);


        Metody.redukuj(lista_pracownikow, 3);

        System.out.println(lista_pracownikow);




    }
}
