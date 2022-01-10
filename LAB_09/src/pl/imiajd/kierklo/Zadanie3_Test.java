package pl.imiajd.kierklo;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;


public class Zadanie3_Test {
    public static void main(String[] args){

        ArrayList<String> lista = new ArrayList<>();

        try{
            File plik_tekstowy = new File("C:\\Users\\Krystian\\Documents\\GitHub\\Programowanie_obiektowe\\LAB_09" +
                    "\\src\\pl\\imiajd\\kierklo\\zadanie3.txt");
            Scanner czytanie = new Scanner(plik_tekstowy);
            while(czytanie.hasNextLine()){
                lista.add(czytanie.nextLine());
            }
            czytanie.close();
        }
        catch(FileNotFoundException fault){
            System.out.println("Został podany nieprawidłowy plik");
            fault.printStackTrace();
        }

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

    }
}
