package LAB_03.src;
import java.util.Random;
import java.util.Scanner;

public class Lab_03_zad_03 {
    public static void main(String[] args){
        Scanner scan_3 = new Scanner(System.in);
        System.out.print("Podaj liczbe m: ");
        int m = scan_3.nextInt();
        System.out.print("Podaj liczbe n: ");
        int n = scan_3.nextInt();
        System.out.print("Podaj liczbe k: ");
        int k = scan_3.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[n][k];
        int c[][] = new int[m][k];

        Random r_3 = new Random();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = r_3.nextInt(10)+1;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                b[i][j] = r_3.nextInt(10)+1;
            }
        }

        int temp = 0;
        for(int i=0; i<k; i++){
            for(int j=0; j<m; j++) {
                for (int l = 0; l < n; l++) {
                    temp += (a[l][i] * b[j][l]);
                }
                c[j][i] = temp;
            }
        }


        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                System.out.print(b[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0; i<k; i++){
            for(int j=0; j<m; j++){
                System.out.print(c[j][i] + " ");
            }
            System.out.println();
        }
    }
}
