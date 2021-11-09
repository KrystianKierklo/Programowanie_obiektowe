import java.util.Random;

public class Lab_03_zad_02 {
    public static int[] generuj(int n, int minWartosc, int maxWartosc){
        int tab[] = new int[n];
        Random r_2 = new Random();
        for(int i=0; i<n; i++){
            tab[i] = (r_2.nextInt(maxWartosc*2)+minWartosc);
        }
        return tab;
    }


    public static int ileNieparzystych(int tab[]){
        int nieparzyste_2 = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] % 2 != 0){
                nieparzyste_2 += 1;
            }
        }
        return nieparzyste_2;
    }


    public static int ileParzystych(int tab[]){
        int parzyste_2 = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] % 2 == 0){
                parzyste_2 += 1;
            }
        }
        return parzyste_2;
    }


    public static int ileDodatnich(int tab[]){
        int dodatnie_2 = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] > 0){
                dodatnie_2 += 1;
            }
        }
        return dodatnie_2;
    }


    public static int ileUjemnych(int tab[]){
        int ujemne_2 = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] < 0){
                ujemne_2 += 1;
            }
        }
        return ujemne_2;
    }


    public static int ileZerowych(int tab[]){
        int zerowe_2 = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] == 0){
                zerowe_2 += 1;
            }
        }
        return zerowe_2;
    }


    public static int ileMaksymalnych(int tab[]){
        int najwiekszy_2 = tab[0];
        int ile_razy_2 = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] > najwiekszy_2){
                najwiekszy_2 = tab[i];
            }
        }
        for(int i=0; i<tab.length; i++){
            if(najwiekszy_2 == tab[i]){
                ile_razy_2 += 1;
            }
        }
        return ile_razy_2;
    }


    public static int sumaDodatnich(int tab[]){
        int suma_dodatnich_2 = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] > 0){
                suma_dodatnich_2 = suma_dodatnich_2 + tab[i];
            }
        }
        return suma_dodatnich_2;
    }


    public static int sumaUjemnych(int tab[]){
        int suma_ujemnych_2 = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] < 0){
                suma_ujemnych_2 = suma_ujemnych_2 + Math.abs(tab[i]);
            }
        }
        return suma_ujemnych_2;
    }


    public static void signum(int tab[]){
        for(int i=0; i<tab.length; i++){
            if(tab[i] > 0){
                tab[i] = 1;
            }
            else{
                tab[i] = -1;
            }
        }
    }

    public static void main(String[] args){
        int tab[] = generuj(30, -999, 999);
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i] + " ");
        }

        System.out.println("\nNieparzystych liczb jest: " + ileNieparzystych(tab));
        System.out.println("Parzystych liczb jest: " + ileParzystych(tab));
        System.out.println("Dodatnich liczb jest: " + ileDodatnich(tab));
        System.out.println("Ujemnych liczb jest: " + ileUjemnych(tab));
        System.out.println("Zer jest: " + ileZerowych(tab));
        System.out.println("Najwiekszy element wystepuje: " + ileMaksymalnych(tab) + " razy");
        System.out.println("Suma dodatnich liczb wynosi: " + sumaDodatnich(tab));
        System.out.println("Suma ujemnych liczb wynosi: " + sumaUjemnych(tab));

        signum(tab);
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i] + " ");
        }
    }
}
