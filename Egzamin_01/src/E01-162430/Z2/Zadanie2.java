import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Zadanie2 {
    public static <T> void printMarginal(T[] arg){
        int dlugosc = arg.length-1;
        System.out.println(arg[0]);
        System.out.println(arg[dlugosc]);
    }







    public static void main(String[] args){
        String[] tab = new String[] {"A", "B", "C", "D"};
        printMarginal(tab);
    }
}
