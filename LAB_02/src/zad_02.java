import java.util.Scanner;

public class zad_02 {
    public static void main(String[] args){
        // zadanie 2

        Scanner scan_2_2 = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_2_2 = scan_2_2.nextInt();
        int suma_2_2 = 0;
        for(int i=0; i<n_2_2; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan_2_2.nextInt();
            if (k >= 0){
            suma_2_2 = suma_2_2 + k;
            }
        }
        suma_2_2 = 2 * suma_2_2;
        System.out.println("Podwojona suma wczytanych liczb ktore sa dodatnie wynosi: " + suma_2_2);


        //zadanie 3

        Scanner scan_2_3 = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_2_3 = scan_2_3.nextInt();
        int ujemne_2_3 = 0;
        int dodatnie_2_3 = 0;
        int zera_2_3 = 0;
        for(int i=0; i<n_2_3; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan_2_3.nextInt();
            if (k < 0){
            ujemne_2_3 += 1;
            }
            else if (k > 0){
                dodatnie_2_3 += 1;
            }
            else{
                zera_2_3 += 1;
            }
        }

        System.out.println("Wsrod wczytanych liczb, liczb ujemnych mamy: " + ujemne_2_3);
        System.out.println("Wsrod wczytanych liczb, liczb dodatnich mamy: " + dodatnie_2_3);
        System.out.println("Wsrod wczytanych liczb, zer mamy: " + zera_2_3);


        //zadanie 4

        Scanner scan_2_4  = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_2_4 = scan_2_4.nextInt();
        int najwieksza_2_4 = 0;
        int najmniejsza_2_4 = 0;
        for(int i=0; i<=n_2_4; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan_2_4.nextInt();
            while(i == 0){
                najwieksza_2_4 = k;
                najmniejsza_2_4 = k;
                i++;
            }
            if(k > najwieksza_2_4){
                najwieksza_2_4 = k;
            }
            else if(k < najmniejsza_2_4){
                najmniejsza_2_4 = k;
            }
        }

        System.out.println("Posrod wczytanych liczb najmniejsza to: " + najmniejsza_2_4);
        System.out.println("Posrod wczytanych liczb najwieksza to: " + najwieksza_2_4);


        // zadanie 5

        //Nie wiem za bardzo o co chodzi w tym zadaniu :(
    }
}
