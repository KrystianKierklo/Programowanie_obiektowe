import java.util.Scanner;
import java.util.Random;
import java.lang.*;

public class zad_01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n = scan.nextInt();
        int[] tab = new int[n];
        Random r = new Random();
        for(int i=0; i<n; i++){
            tab[i] = r.nextInt(1998)-999;
        }

        for(int i=0; i<n; i++){
            System.out.print(tab[i] + " ");
        }

        // a)
        int nieparzyste = 0;
        int parzyste = 0;
        for(int i=0; i<n; i++){
            if(tab[i] % 2 == 0){
                parzyste += 1;
            }
            else{
                nieparzyste += 1;
            }
        }
        System.out.println("\n\nParzystych liczb mamy: " + parzyste);
        System.out.println("Nieparzystych liczb mamy: " + nieparzyste);


        // b)
        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;

        for(int i=0; i<n; i++){
            if(tab[i] > 0){
                dodatnie += 1;
            }
            else if(tab[i] < 0){
                ujemne += 1;
            }
            else{
                zera += 1;
            }
        }
        System.out.println("\nLiczb dodatnich mamy: " + dodatnie);
        System.out.println("Liczb ujemnych mamy: " + ujemne);
        System.out.println("Zer mamy: " + zera);

        // c)
        int najwiekszy = tab[0];
        int ile_razy = 0;
        for(int i=0; i<n; i++){
            if(tab[i] > najwiekszy){
                najwiekszy = tab[i];
            }
        }
        for(int i=0; i<n; i++){
            if(najwiekszy == tab[i]){
                ile_razy += 1;
            }
        }
        System.out.println("\nNajwieksza wartosc to: " + najwiekszy + " i wystepuje: " + ile_razy + " razy");

        // d)

        int suma_ujemnych = 0;
        int suma_dodatnich = 0;
        for(int i=0; i<n; i++){
            if(tab[i] < 0){
                suma_ujemnych += Math.abs(tab[i]);
            }
            else{
                suma_dodatnich += tab[i];
            }
        }

        System.out.println("\nSuma ujemnych elementow wynosi: " + suma_ujemnych);
        System.out.println("Suma dodatnich elementow wynosi: " + suma_dodatnich + "/n");


        // e)
//        int najdluzszy = 0;
//        int obecny = tab[0];
//        for(int i=0; i<n; i++){
//        }





        // f)
        for(int i=0; i<n; i++){
            if(tab[i] > 0){
                tab[i] = 1;
            }
            else{
                tab[i] = -1;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(tab[i] + " ");
        }

        // g)

        // Nie wiem za bardzo o co chodzi w tym zadaniu.
    }
}
