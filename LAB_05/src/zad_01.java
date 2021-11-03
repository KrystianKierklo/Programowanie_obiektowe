import java.util.ArrayList;


public class zad_01 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> lista_1 = new ArrayList<Integer>();
        lista_1.addAll(a);
        lista_1.addAll(b);
        return lista_1;
    }


    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> lista_2 = new ArrayList<Integer>();
        int max = Math.min(a.size(), b.size());
        int temp = 0;
        for(int i=0; i<max; i++){
            lista_2.add(a.get(i));
            lista_2.add(b.get(i));
            temp++;
        }
        if(a.size() > b.size()){
            for(int i=0; i<Math.abs(a.size() - b.size()); i++){
                lista_2.add(a.get(i+temp));
            }
        }
        else {
            for (int i = 0; i < Math.abs(a.size() - b.size()); i++) {
                lista_2.add(b.get(i + temp));
            }
        }
        return lista_2;
    }


//    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
//
//
//    }


    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> lista_4 = new ArrayList<>();
        for(int i=a.size()-1; i>=0; i--){
            lista_4.add(a.get(i));
        }
        return lista_4;
    }


    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> kopia_a = new ArrayList<>(a);
        int licznik = 0;
        for(int i=a.size()-1; i>=0; i--){
            a.set(licznik, kopia_a.get(i));
            licznik++;
        }
    }



    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.println(append(a,b));
        System.out.println(merge(a,b));

        System.out.println(reversed(a));
        System.out.print(reversed(a));

    }
}
