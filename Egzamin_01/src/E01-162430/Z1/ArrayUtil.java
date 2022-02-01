import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayUtil {
    public static <T extends Comparable<T>> ArrayList<T> removeRepetedElement (T[] tab){
        ArrayList<T> lista1 = new ArrayList<T>();
        boolean zmienna = false;
        for(int i=0; i<= tab.length-1; i++){
            lista1.add(tab[i]);
            for(int j=1; j< tab.length; j++) {
                if (tab[i] == tab[j]) {
                    lista1.remove(tab[i]);
                }
            }
        }
        return lista1;
    }




    public static void main(String[] args){
        Character[] tab1 = new Character[] {'A', 'B', 'B', 'C'};
        System.out.println(removeRepetedElement(tab1));

        LocalDate[] tab2 = new LocalDate[]{LocalDate.of(2000,12,12),
                LocalDate.of(2000,12,12)};

        System.out.println(removeRepetedElement(tab2));

    }
}
