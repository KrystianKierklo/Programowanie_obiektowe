public class PairDemo {
    public static void main(String[] args){

        String[] slowa = {"Jeden", "Dwa", "Trzy"};

        Pair<String> para = new Pair<>(slowa[0], slowa[1]);

        System.out.println(para.getFirst() + " -> " + para.getSecond());

        para.swap();

        System.out.println(para.getFirst() + " -> " + para.getSecond());

    }
}
