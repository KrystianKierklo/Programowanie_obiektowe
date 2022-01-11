import java.util.ArrayList;
import java.util.Collections;

public class PairUtil {
   public static <T>Pair<T> swap(Pair<T> pair){
      Pair<T> pair2 = new Pair<T>(pair.getFirst(), pair.getSecond());
      pair.swap();
      return pair2;
   }

   public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tablica) {
      ArrayList<T> temp = new ArrayList<>(tablica);
      Collections.sort(temp);
      return tablica.equals(temp);
   }
}
