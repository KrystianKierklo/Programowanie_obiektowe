import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.*;

public class Zadania {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        for(int i=n-1; i<pracownicy.size(); i+=n-1){
            pracownicy.remove(i);
        }
    }


    public static<T> void odwroc(LinkedList<T> lista){
        LinkedList<T> temp = new LinkedList<T>(lista);
        for(int i=lista.size()-1, j=0; i>=0; i--, j++){
            lista.set(j,temp.get(i));
        }
    }


    public static void rozbijanie_na_cyfry(int liczba){
        Stack<Integer> stos = new Stack<>();
        while(liczba != 0){
            stos.push(liczba % 10);
            liczba = liczba / 10;
        }

        while(stos.empty() == false){
            System.out.print(stos.pop() + " ");
        }
    }


    public static void sito_eratostenesa(int n){
        ArrayList<Integer> pierwsze = new ArrayList<>();
        for(int i=2; i<=n; i++){
            pierwsze.add(i);
        }
        for(int i=2; i<Math.sqrt(n); i++){
            for(int j=2*i; j<=n; j+=i){
                pierwsze.remove((Object)j);
            }
        }
        System.out.println(pierwsze);
    }


    public static <T extends Iterable<?>> void print(T object ){
        Iterator<?> it= object.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
            if (it.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println();
    }




    public static void main(String[] args){

        LinkedList<String> lista_pracownikow = new LinkedList<>();
        lista_pracownikow.add("Andrzej");
        lista_pracownikow.add("Jurek");
        lista_pracownikow.add("Mirek");
        lista_pracownikow.add("Janusz");
        lista_pracownikow.add("Waldek");
        lista_pracownikow.add("Eugeniusz");
        lista_pracownikow.add("Jan");
        lista_pracownikow.add("Maciek");

        for(String e : lista_pracownikow){
            System.out.print(e + " ");
        }

        Zadania.redukuj(lista_pracownikow, 2);
        System.out.println("\n");

        for(String e : lista_pracownikow){
            System.out.print(e + " ");
        }


        LinkedList<String> zadanie_2 = new LinkedList<>();
        zadanie_2.add("ALA");
        zadanie_2.add("MA");
        zadanie_2.add("KOTA");

        System.out.println("\n");
        for(String e : zadanie_2){
            System.out.print(e + " ");
        }

        Zadania.odwroc(zadanie_2);
        System.out.println("\n");

        for(String e : zadanie_2){
            System.out.print(e + " ");
        }

        System.out.printf("\n\n");
        rozbijanie_na_cyfry(2022);


        System.out.println("\n");
        sito_eratostenesa(17);


        System.out.println("\n");
        print(lista_pracownikow);
    }
}
