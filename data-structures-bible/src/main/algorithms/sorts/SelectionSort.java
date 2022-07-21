package main.algorithms.sorts;
import static main.algorithms.utils.SortUtils.*;

public class SelectionSort implements SortAlgorithm{
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        for(int i = 0, size = unsorted.length; i < size - 1; i++){
            int biggestIndex = size - i - 1;
            for(int j = 0; j < size - i - 1; j++){
                if(greater(unsorted[j],unsorted[biggestIndex])) biggestIndex = j;
            }
            if(greater(unsorted[biggestIndex], unsorted[size - i - 1])) swap(unsorted,biggestIndex, size - i - 1);
        }
        return unsorted;
    }
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();

        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        print(selectionSort.sort(integers));

        String[] strings = {"c", "a", "e", "b", "d"};
        print(selectionSort.sort(strings));
    }
}
