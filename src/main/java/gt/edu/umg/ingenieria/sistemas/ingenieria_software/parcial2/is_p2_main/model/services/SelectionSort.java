package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.model.services;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.selection_sort.services.ISelectionSort;

import java.util.Arrays;

public class SelectionSort implements ISortingAlgorithms {
    @Override
    public void order(String[] args) {
        System.out.println(Arrays.toString(args));
        ISelectionSort selectionSort = new gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.selection_sort.services.SelectionSort();
        selectionSort.selectionSort(args, args.length);
        System.out.println(Arrays.toString(args));
    }
}
