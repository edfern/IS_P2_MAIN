package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.model.services;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort.services.IInsertionSort;

import java.util.Arrays;

public class InsertionSort implements ISortingAlgorithms {
    @Override
    public void order(String[] args) {
        System.out.println(Arrays.toString(args));
        IInsertionSort iInsertionSort = new gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort.services.InsertionSort();
        iInsertionSort.insertionSort(args);
        System.out.println(Arrays.toString(args));
    }
}
