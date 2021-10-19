import java.util.Scanner;

public class zad_02 {
    public static void main(String[] args){
        // zadanie 2

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n = scan.nextInt();
        int suma = 0;
        for(int i=0; i<n; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan.nextInt();
            if (k >= 0){
            suma = suma + k;
            }
        }
        suma = 2 * suma;
        System.out.print("Podwojona suma wczytanych liczb ktore sa dodatnie wynosi: " + suma);


        //zadanie 3

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n = scan.nextInt();
        int ujemne = 0;
        int dodatnie = 0;
        int zera = 0;
        for(int i=0; i<n; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan.nextInt();
            if (k < 0){
            ujemne += 1;
            }
            else if (k > 0){
                dodatnie += 1;
            }
            else{
                zera += 1;
            }
        }

        System.out.println("Wsrod wczytanych liczb, liczb ujemnych mamy: " + ujemne);
        System.out.println("Wsrod wczytanych liczb, liczb dodatnich mamy: " + dodatnie);
        System.out.println("Wsrod wczytanych liczb, zer mamy: " + zera);


        //zadanie 4

        Scanner scan  = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n = scan.nextInt();
        int najwieksza = 0;
        int najmniejsza = 0;
        for(int i=0; i<=n; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan.nextInt();
            while(i == 0){
                najwieksza = k;
                najmniejsza = k;
                i++;
            }
            if(k > najwieksza){
                najwieksza = k;
            }
            else if(k < najmniejsza){
                najmniejsza = k;
            }
        }

        System.out.println("Posrod wczytanych liczb najmniejsza to: " + najmniejsza);
        System.out.print("Posrod wczytanych liczb najwieksza to: " + najwieksza);


        // zadanie 5

        //Nie wiem za bardzo o co chodzi w tym zadaniu :(
    }
}
