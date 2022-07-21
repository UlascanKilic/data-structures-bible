package main.algorithms.sorts;

import static main.algorithms.utils.SortUtils.*;

public class BubbleSort implements SortAlgorithm{

    /*
    * see SortAlgorithm
    * Big O -> n^2
    *
    */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {

        for(int i = 0, size = unsorted.length - 1; i < size;i++){
            boolean swapped = false;
            for(int j = 0; j < size - i;j++){
                if(greater(unsorted[j], unsorted[j+1])) swapped = swap(unsorted, j,j+1);
            }
            if(!swapped) return unsorted;
        }
        return unsorted;
    }

    public static void main(String[] args) {
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        BubbleSort bubbleSort = new BubbleSort();
        print(bubbleSort.sort(integers));

        String[] strings = {"c", "a", "e", "b", "d"};
        bubbleSort.sort(strings);
        print(bubbleSort.sort(strings));
    }
}


