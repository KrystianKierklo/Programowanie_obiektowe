import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class PairUtilDemo {
    public static void main(String[] args){
        String[] slowa = {"Jeden", "Dwa", "Trzy"};

        Pair<String> para = new Pair<>(slowa[0], slowa[1]);

        System.out.println(para.getFirst() + "-->" + para.getSecond());
        para.swap();
        System.out.println(para.getFirst() + "-->" + para.getSecond());

        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(4);
        test1.add(3);
        test1.add(2);
        test1.add(8);

        System.out.println("\n" + test1);
        System.out.println("Czy tablica jest posortowania: " + PairUtil.isSorted(test1));

        Collections.sort(test1);

        System.out.println("\n" + test1);
        System.out.println("Czy tablica jest posortowania: " + PairUtil.isSorted(test1));

        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(10);
        test2.add(20);
        test2.add(30);
        test2.add(40);

        System.out.println("\n" + test2);
        System.out.println("Czy tablica jest posortowania: " + PairUtil.isSorted(test2));


        ArrayList<LocalDate> test3 = new ArrayList<>();
        test3.add(LocalDate.of(2003,10,15));
        test3.add(LocalDate.of(2001,6,30));
        test3.add(LocalDate.of(2006,2,8));

        System.out.println("\n" + test3);
        System.out.println("Czy tablica jest posortowania: " + PairUtil.isSorted(test3));

        Collections.sort(test3);

        System.out.println("\n" + test3);
        System.out.println("Czy tablica jest posortowania: " + PairUtil.isSorted(test3));

        ArrayList<LocalDate> test4 = new ArrayList<>();
        test4.add(LocalDate.of(2000,5,5));
        test4.add(LocalDate.of(2000,8,12));
        test4.add(LocalDate.of(2001,11,12));

        System.out.println("\n" + test4);
        System.out.println("Czy tablica jest posortowania: " + PairUtil.isSorted(test4));

    }
}
