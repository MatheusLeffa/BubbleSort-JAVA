/*
Project: Bubblesort Augorithm
Autor: Matheus Hilbert
*/
package com.sorting;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] listArray = {1,5,3,2,9};
        List<Integer> listCollection = Arrays.asList(-1,0,2,3,2,10);

        //Unsorted
        System.out.println("Unsorted listArray: " + Arrays.toString(listArray));
        System.out.println("Unsorted listCollection: " + listCollection);
        System.out.println("----------------------------------");

        //Sorted
        System.out.println("Sorted listArray: " + Arrays.toString(SortingAlgorithm.bubbleSort(listArray)));
        System.out.println("Sorted listCollection: " + SortingAlgorithm.bubbleSort(listCollection));
    }
}