package main.algorithms.utils;

import java.util.Arrays;
import java.util.List;

public final class SortUtils {

    public static <T> boolean swap(T[] array, int firstIndex, int secondIndex){
        T swap = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = swap;
        return true;
    }

    static <T extends Comparable<T>> boolean less(T v, T w){
        return v.compareTo(w) < 0;
    }

    public static <T extends Comparable<T>> boolean greater(T v, T w){
        return v.compareTo(w) > 0;
    }

    static <T extends Comparable<T>> boolean greaterOrEqual(T v, T w) {
        return v.compareTo(w) >= 0;
    }

    public static void print(Object[] toPrint){
        System.out.println(Arrays.toString(toPrint));
    }

    static void print(List<?> toPrint){
        toPrint.stream().map(Object::toString).map(str -> str + " ").forEach(System.out::print);
    }

}
