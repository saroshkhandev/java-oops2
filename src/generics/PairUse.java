package generics;

public class PairUse {

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<String, Integer>("Sarosh", 2);

        System.out.println(p.getFirst());
        System.out.println(p.getSecond());

        Pair<Integer, String> ps = new Pair<Integer, String>(1, "cd");

        ps.setFirst(5);
        ps.setSecond("Sarosh");

        System.out.println(ps.getFirst());
        System.out.println(ps.getSecond());

        Pair<Pair<String, Integer>, Integer> p3 = new Pair<>(p, 2);
        System.out.println(p3.getFirst().getFirst());
        System.out.println(p3.getSecond());
    }
}
