package generics;

public class Print {
    public static<T> void printArray(T[] arr) {
        for(T value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 4, 5, 6, 7};
        Character[] arr2 = {'a', 'b', 'b', 'c', 'd'};
        printArray(arr);
        printArray(arr2);
    }
}
