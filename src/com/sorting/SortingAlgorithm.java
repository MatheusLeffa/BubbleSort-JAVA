package com.sorting;

import java.util.Collections;
import java.util.List;

public class SortingAlgorithm {
    public static Integer[] bubbleSort(Integer[] list) {
        int listLength = list.length;
        int aux;
        boolean swap;


        do {
            swap = false;
            for (int index = 0; index < listLength - 1; index++) {
                if (list[index] > list[index + 1]) {
                    swap = true;
                    aux = list[index];
                    list[index] = list[index + 1];
                    list[index + 1] = aux;
                }
            }
        } while (swap);
        return list;
    }

    public static List<Integer> bubbleSort(List<Integer> list) {
        int listLength = list.size();
        boolean swap;

        do {
            swap = false;
            for (int index = 0; index < listLength - 1; index++) {
                if (list.get(index) > list.get(index + 1)) {
                    swap = true;
                    Collections.swap(list, index, index + 1);
                }
            }
        } while (swap);
        return list;
    }
}