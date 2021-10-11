public class zad_04 {
    public static void main(String[] args){
        double stan = 1000;
        System.out.println("Saldo na start wynosi: " + stan);
        for(int i=1;i<=3;i++){
            stan = stan * 1.06;
        }
        System.out.print("Saldo po 3 latach wynosi: " + stan);
    }
}
