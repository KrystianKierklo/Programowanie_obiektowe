import java.util.Scanner;
import java.lang.Math.*;
import java.util.ArrayList;

public class zad_01 {
    public static void main(String[] args){
        // zadanie.1

        // a)
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_a = scan.nextInt();
        int suma_a = 0;
        for(int i=1; i<=n_a; i++){
            System.out.print("Podaj liczbe: ");
            int k = scan.nextInt();
            suma_a += k;
        }
        System.out.println("Suma wczytanych liczb wynosi: " + suma_a);


        // b)
        Scanner scan_b = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_b = scan_b.nextInt();
        int iloczyn_b = 1;
        for(int i=1; i<=n_b; i++){
            System.out.print("Podaj liczbe: ");
            int k = scan_b.nextInt();
            iloczyn_b *= k;
        }
        System.out.println("Iloczyn wczytanych liczb wynosi: " + iloczyn_b);


        // c)
        Scanner scan_c = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_c = scan_c.nextInt();
        int suma_c = 0;
        for(int i=1; i<=n_c; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan_c.nextInt();
            suma_c = suma_c + Math.abs(k);
        }
        System.out.println("Suma wartosci bezwzglednych wprowadzonych wartosci wynosi: " + suma_c);


        // d)
        Scanner scan_d = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_d = scan_d.nextInt();
        double suma_d = 0;
        for(int i=1; i<=n_d; i++){
            System.out.print("Podaj liczbe calkowita: ");
            double k = scan_d.nextDouble();
            k = Math.abs(k);
            suma_d = suma_d + Math.sqrt(k);
        }
        System.out.println("Suma pierwiastkow z wartosci bezwzglednych wprowadzonych wartosci wynosi: " + suma_d);


        // e)
        Scanner scan_e = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_e = scan_e.nextInt();
        int iloczyn_e = 1;
        for(int i=1; i<=n_e; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan_e.nextInt();
            iloczyn_e = iloczyn_e * Math.abs(k);
        }
        System.out.println("Iloczyn wartosci bezwzglednych wprowadzonych wartosci wynosi: " + iloczyn_e);


        // f)
        Scanner scan_f = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_f = scan_f.nextInt();
        double suma_f = 0;
        for(int i=1; i<=n_f; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan_f.nextInt();
            suma_f = suma_f + Math.pow((double)k, 2);
        }
        System.out.println("Suma kwadratow wprowadzonych wartosci wynosi: " + suma_f);


        // g)

        Scanner scan_g = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_g = scan_g.nextInt();
        double suma_g = 0;
        double iloczyn_g = 1;
        for(int i=1; i<=n_g; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan_g.nextInt();
            suma_g += k;
            iloczyn_g *= k;
        }
        System.out.println("Suma podanych wartosci wynosi: " + suma_g);
        System.out.println("Iloczyn podanych wartosci wynosi: " + iloczyn_g);


        // h)

        Scanner scan_h = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n_h = scan_h.nextInt();
        int suma_h = 0;
        for(int i=1; i<=n_h; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan_h.nextInt();
            if (i % 2 != 0){
                suma_h = suma_h + k;
            }
            else {
                suma_h = suma_h - k;
            }
        }
        System.out.println("Wynik dzialania na wczytanych liczbach wynosi: " + suma_h);


        // i)



        // Zadanie.2

        Scanner scan_1_2 = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        int n = scan_1_2.nextInt();
        int[] tablica = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Podaj liczbe calkowita: ");
            int k = scan_1_2.nextInt();
            tablica[i] = k;
        }
        for(int i=1; i<=n-1; i++){
            System.out.print(tablica[i] + " ");
        }
        System.out.print(tablica[0]);
    }
}
