package generics;

public class Pair<T, T2> {
    private T first;
    private T2 second;

    public Pair(T first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }


}
